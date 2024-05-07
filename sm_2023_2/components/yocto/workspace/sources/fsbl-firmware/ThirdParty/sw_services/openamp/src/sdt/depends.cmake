if (WITH_DOC)
  find_package (Doxygen)
endif (WITH_DOC)

if ("${CMAKE_SYSTEM_NAME}" STREQUAL "Linux")
  check_include_files (stdatomic.h HAVE_STDATOMIC_H)
  check_include_files (fcntl.h HAVE_FCNTL_H)
else ("${CMAKE_SYSTEM_NAME}" STREQUAL "Linux")
  set (_saved_cmake_required_flags ${CMAKE_REQUIRED_FLAGS})
  set (CMAKE_REQUIRED_FLAGS "-c")
  check_include_files (stdatomic.h HAVE_STDATOMIC_H)
  check_include_files (fcntl.h HAVE_FCNTL_H)
  set (CMAKE_REQUIRED_FLAGS ${_saved_cmake_required_flags})
endif ("${CMAKE_SYSTEM_NAME}" STREQUAL "Linux")

if (NOT HAVE_FCNTL_H)
  unset (WITH_PROXY CACHE)
endif (NOT HAVE_FCNTL_H)
