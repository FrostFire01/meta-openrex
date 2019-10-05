# Copyright (C) 2016 FEDEVEL
# Released under the MIT license (see COPYING.MIT for the terms)
 
SUMMARY = "Linux Kernel for OpenRex board"
DESCRIPTION = "Linux Kernel for OpenRex board. More info \
at http://www.imx6rex.com/open-rex"

require recipes-kernel/linux/linux-imx.inc
require recipes-kernel/linux/linux-dtb.inc

DEPENDS += "lzop-native bc-native"


SRCBRANCH = "jethro"
LOCALVERSION = "-fslc"

SRCREV = "b33c6bb6558fd6d7b2f85f9088b399c6d4c3e7ba"

SRC_URI = "git://github.com/FrostFire01/openrex-linux-3.14.git;branch=${SRCBRANCH} \
           file://defconfig"

#Always update SRCREV based on your last commit
SRCREV = "58f44dd3178b7a9878298bd948082e01f4fe28fb"

#PV .= "+git${SRCPV}"


COMPATIBLE_MACHINE = "(mx6|mx7|imx6q-openrex)"
