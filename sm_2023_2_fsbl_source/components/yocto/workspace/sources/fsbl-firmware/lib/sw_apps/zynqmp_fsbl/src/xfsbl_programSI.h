#ifndef XFSBL_PROGRAMSI_H
#define XFSBL_PROGRAMSI_H

#ifdef __cplusplus
extern "C" {
#endif

#include "xfsbl_hw.h"
#include "xil_types.h"
  /*serv base*/
#define AXI_ADDR_SERV 0xA8004000
#define AXI_ADDR_SI 0xA0006000
#define SI_CONFIG_BASE_ADDR AXI_ADDR_SERV
  /*i2c base*/
#define SI_I2C_BASE_ADDR AXI_ADDR_SI
void SiI2cWrite(u8 address,u8 data);


void ProgramSI();

#ifdef __cplusplus
}
#endif

#endif  /* XFSBL_PROGRAMSI_H */
