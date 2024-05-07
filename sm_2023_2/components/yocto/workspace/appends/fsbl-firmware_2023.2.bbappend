FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"
FILESPATH:prepend := "/home/madorsky/projects/petalinux/sm_2023_2/components/yocto/workspace/sources/fsbl-firmware/oe-local-files:"
# srctreebase: /home/madorsky/projects/petalinux/sm_2023_2/components/yocto/workspace/sources/fsbl-firmware

inherit externalsrc
# NOTE: We use pn- overrides here to avoid affecting multiple variants in the case where the recipe uses BBCLASSEXTEND
EXTERNALSRC:pn-fsbl-firmware = "/home/madorsky/projects/petalinux/sm_2023_2/components/yocto/workspace/sources/fsbl-firmware"

# initial_rev: c9a0ee31b2a14cbcfcb56ca369037319b4ad4847
# commit: 79f4a7ad60da1d34057d048e048df890d60cd2ae
