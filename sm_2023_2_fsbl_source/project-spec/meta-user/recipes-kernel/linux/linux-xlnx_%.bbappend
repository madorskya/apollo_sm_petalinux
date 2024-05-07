FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI:append = " file://bsp.cfg"
KERNEL_FEATURES:append = " bsp.cfg"
SRC_URI += "file://user_2024-04-27-21-50-00.cfg \
            file://user_2024-05-02-01-14-00.cfg \
            file://user_2024-05-03-20-54-00.cfg \
            "

