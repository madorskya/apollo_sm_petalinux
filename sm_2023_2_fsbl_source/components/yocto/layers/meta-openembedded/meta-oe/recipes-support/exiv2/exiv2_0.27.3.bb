SUMMARY = "Exif, Iptc and XMP metadata manipulation library and tools"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=625f055f41728f84a8d7938acc35bdc2"

DEPENDS = "zlib expat"

SRC_URI = "https://github.com/Exiv2/${BPN}/releases/download/v${PV}/${BP}-Source.tar.gz"
SRC_URI[sha256sum] = "a79f5613812aa21755d578a297874fb59a85101e793edc64ec2c6bd994e3e778"

# Once patch is obsolete (project should be aware due to PRs), dos2unix can be removed either
inherit dos2unix
SRC_URI += "file://0001-Use-compiler-fcf-protection-only-if-compiler-arch-su.patch \
            file://CVE-2021-29457.patch \
            file://CVE-2021-29458.patch \
            file://CVE-2021-29463.patch \
            file://CVE-2021-29464.patch \
            file://CVE-2021-29470.patch \
            file://CVE-2021-29473.patch \
            file://CVE-2021-3482.patch"

S = "${WORKDIR}/${BPN}-${PV}-Source"

inherit cmake gettext

do_install:append:class-target() {
    # reproducibility: remove build host path
    sed -i ${D}${libdir}/cmake/exiv2/exiv2Config.cmake \
        -e 's:${STAGING_DIR_HOST}::g'
}

