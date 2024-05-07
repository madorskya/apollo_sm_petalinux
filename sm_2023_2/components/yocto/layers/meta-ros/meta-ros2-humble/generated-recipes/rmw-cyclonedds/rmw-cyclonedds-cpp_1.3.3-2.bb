# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_humble
inherit ros_superflore_generated

DESCRIPTION = "Implement the ROS middleware interface using Eclipse CycloneDDS in C++."
AUTHOR = "Erik Boasson <erik.boasson@adlinktech.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache License 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "rmw_cyclonedds"
ROS_BPN = "rmw_cyclonedds_cpp"

ROS_BUILD_DEPENDS = " \
    cyclonedds \
    iceoryx-binding-c \
    rcpputils \
    rcutils \
    rmw \
    rmw-dds-common \
    rosidl-runtime-c \
    rosidl-typesupport-introspection-c \
    rosidl-typesupport-introspection-cpp \
    tracetools \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-ros-native \
"

ROS_EXPORT_DEPENDS = " \
    cyclonedds \
    iceoryx-binding-c \
    rcpputils \
    rcutils \
    rmw \
    rmw-dds-common \
    rosidl-runtime-c \
    rosidl-typesupport-introspection-c \
    rosidl-typesupport-introspection-cpp \
    tracetools \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    cyclonedds \
    iceoryx-binding-c \
    rcpputils \
    rcutils \
    rmw \
    rmw-dds-common \
    rosidl-runtime-c \
    rosidl-typesupport-introspection-c \
    rosidl-typesupport-introspection-cpp \
    tracetools \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-lint-auto \
    ament-lint-common \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/rmw_cyclonedds-release/archive/release/humble/rmw_cyclonedds_cpp/1.3.3-2.tar.gz
ROS_BRANCH ?= "branch=release/humble/rmw_cyclonedds_cpp"
SRC_URI = "git://github.com/ros2-gbp/rmw_cyclonedds-release;${ROS_BRANCH};protocol=https"
SRCREV = "412f3e6b1474831c2061bc8c52028a11cc245f63"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
