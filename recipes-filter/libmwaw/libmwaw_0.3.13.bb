SUMMARY = "A library for import of many old Mac document formats"
HOMEPAGE = "http://sourceforge.net/projects/libmwaw"
LICENSE = " LGPLv2.1 & MPL-2.0"
LIC_FILES_CHKSUM = " \
    file://COPYING.LGPL;md5=a049c5e22d3bd7bc3c9a2e9135a6d104 \
    file://COPYING.MPL;md5=cce0d89a18de69e7f51f693182ac4a3e \
"

SRC_URI = "${SOURCEFORGE_MIRROR}/project/${BPN}/${BPN}/${BPN}-${PV}/${BPN}-${PV}.tar.bz2"
SRC_URI[md5sum] = "6476771865cdc11255eaec5f99421f35"
SRC_URI[sha256sum] = "2c29775ffc1e33f07351b9e5c69d9d5b4065660b01ae27ba7ddf15cbb14d09ec"

inherit autotools-brokensep pkgconfig

DEPENDS = "librevenge"
