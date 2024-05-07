Apollo Service Module Petalinux 2023.2 kernel

Includes support for SSD

How to build:

1. Configure for Petalinux 2023.2, by running settings.sh from petalinux/2023.2 directory
2. cd sm_2023_2
3. petalinux-build
4. cd images/linux
5. petalinux-package --fsbl zynqmp_fsbl.elf --boot --u-boot --force --fpga system.bit
6. copy BOOT.BIN boot.scr image.ub rootfs.tar.gz onto SD card BOOT partition
7. Boot SM from that SD card
