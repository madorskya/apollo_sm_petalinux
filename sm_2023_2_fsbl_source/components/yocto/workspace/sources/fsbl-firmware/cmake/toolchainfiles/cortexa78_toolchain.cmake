# Copyright (C) 2023 Advanced Micro Devices, Inc.  All rights reserved.
# SPDX-License-Identifier: MIT
set( CMAKE_EXPORT_COMPILE_COMMANDS ON)
set( CMAKE_INSTALL_MESSAGE LAZY)
set( CMAKE_C_COMPILER aarch64-none-elf-gcc )
set( CMAKE_CXX_COMPILER aarch64-none-elf-g++ )
set( CMAKE_C_COMPILER_LAUNCHER  )
set( CMAKE_CXX_COMPILER_LAUNCHER  )
set( CMAKE_ASM_COMPILER aarch64-none-elf-gcc )
set( CMAKE_AR aarch64-none-elf-ar CACHE FILEPATH "Archiver" )
set( CMAKE_SIZE aarch64-none-elf-size CACHE FILEPATH "Size" )
set( CMAKE_SYSTEM_PROCESSOR "cortexa78" )
set( CMAKE_MACHINE "VersalNet" )
set( CMAKE_SYSTEM_NAME "Generic" )
set( CMAKE_SPECS_FILE "$ENV{ESW_REPO}/scripts/specs/arm/Xilinx.spec" CACHE STRING "Specs file path for using CMAKE toolchain files" )
set( TOOLCHAIN_C_FLAGS " -O2 -DSDT -Dversal -DVERSAL_NET -DARMA78_EL3" CACHE STRING "CFLAGS" )
set( TOOLCHAIN_CXX_FLAGS " -O2 -DSDT -Dversal -DVERSAL_NET -DARMA78_EL3" CACHE STRING "CXXFLAGS" )
set( TOOLCHAIN_ASM_FLAGS " -O2 -DSDT -Dversal -DVERSAL_NET -DARMA78_EL3" CACHE STRING "ASM FLAGS" )
set( TOOLCHAIN_DEP_FLAGS " -MMD -MP" CACHE STRING "Flags used by compiler to generate dependency files")
set( TOOLCHAIN_EXTRA_C_FLAGS " -g -Wall -Wextra -fno-tree-loop-distribute-patterns" CACHE STRING "Extra CFLAGS")
set( CMAKE_C_FLAGS_RELEASE "-DNDEBUG" CACHE STRING "Additional CFLAGS for release" )
set( CMAKE_CXX_FLAGS_RELEASE "-DNDEBUG" CACHE STRING "Additional CXXFLAGS for release" )
set( CMAKE_ASM_FLAGS_RELEASE "-DNDEBUG" CACHE STRING "Additional ASM FLAGS for release" )