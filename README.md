Apollo Service Module Petalinux 2023.2 kernel

Includes support for SSD

How to build:

1. Configure for Petalinux 2023.2, by running settings.sh from petalinux/2023.2 directory
2. cd sm_2023_2
3. petalinux-config --get-hw-description ../../../../vivado/apollo/apollo_sm_vivado/apollo_sm_xu8/
4. petalinux-build
5. cd images/linux
6. petalinux-package --fsbl zynqmp_fsbl.elf --boot --u-boot --force --fpga system.bit
7. copy BOOT.BIN boot.scr image.ub rootfs.tar.gz onto SD card BOOT partition
8. Boot SM from that SD card

If using dma-jtag:
1. untar rootfs.tar.gz
2. find this file: ./lib/modules/6.1.30-xilinx-v2023.2/extra/dma_proxy.ko
3. Copy it to the similar path in Alma rootfs image
4. use insmod to start it
