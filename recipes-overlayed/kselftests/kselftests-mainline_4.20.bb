SUMMARY = "Linux Kernel Selftests (mainline)"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://www.kernel.org/pub/linux/kernel/v4.x/linux-${PV}.tar.xz"
# Patches inappropriate or not yet merged by upstream
# Some patches may have been submitted to upstream
SRC_URI += "\
    file://0001-selftests-lib-allow-to-override-CC-in-the-top-level-Makefile.patch \
    file://0001-selftests-net-use-LDLIBS-instead-of-LDFLAGS-next-20180416.patch \
    file://0002-selftests-seccomp-use-LDLIBS-instead-of-LDFLAGS.patch \
    file://0003-selftests-timers-use-LDLIBS-instead-of-LDFLAGS.patch \
"

SRC_URI[md5sum] = "d39dd4ba2d5861c54b90d49be19eaf31"
SRC_URI[sha256sum] = "ad0823183522e743972382df0aa08fb5ae3077f662b125f1e599b0b2aaa12438"

S = "${WORKDIR}/linux-${PV}"

export INSTALL_PATH = "/opt/kselftests/mainline"

require kselftests-common.inc
