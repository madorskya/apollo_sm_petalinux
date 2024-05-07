DESCRIPTION = "Demo scripts to run common usecases involving VDU in Versal"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=17e31b2e971eed6471a361c7dc4faa18"

require gstreamer-multimedia-notebooks_0.1.inc

S = "${WORKDIR}/git"

inherit features_check

REQUIRED_MACHINE_FEATURES = "vdu"
PACKAGE_ARCH = "${MACHINE_ARCH}"

RDEPENDS:${PN} = "gstreamer1.0-omx gstreamer1.0-plugins-bad bash python3-pip alsa-utils"

EXTRA_OEMAKE = 'D=${D} bindir=${bindir} datadir=${datadir}'

do_install() {
	oe_runmake -C ${S}/vdu install_vdu_examples
}

# These libraries shouldn't get installed in world builds unless something
# explicitly depends upon them.

EXCLUDE_FROM_WORLD = "1"
