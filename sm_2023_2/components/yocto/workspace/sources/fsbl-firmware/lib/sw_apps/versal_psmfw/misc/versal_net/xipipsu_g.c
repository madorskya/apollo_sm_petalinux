/*******************************************************************
*
* CAUTION: This file is automatically generated by HSI.
* Version: 2022.1
* DO NOT EDIT.
*
* Copyright (C) 2010-2022 Xilinx, Inc. All Rights Reserved.
* Copyright (c) 2022 - 2023 Advanced Micro Devices, Inc. All Rights Reserved.
* SPDX-License-Identifier: MIT

*
* Description: Driver configuration
*
*******************************************************************/

#include "xparameters.h"
#include "xipipsu.h"

/*
* The configuration table for devices
*/

XIpiPsu_Config XIpiPsu_ConfigTable[XPAR_XIPIPSU_NUM_INSTANCES] =
{

	{
		XPAR_PSV_IPI_PSM_DEVICE_ID,
		XPAR_PSV_IPI_PSM_S_AXI_BASEADDR,
		XPAR_PSV_IPI_PSM_BIT_MASK,
		XPAR_PSV_IPI_PSM_BUFFER_INDEX,
		XPAR_PSV_IPI_PSM_INT_ID,
		XPAR_XIPIPSU_NUM_TARGETS,
		{

			{
				XPAR_PSV_IPI_0_BIT_MASK,
				XPAR_PSV_IPI_0_BUFFER_INDEX
			},
			{
				XPAR_PSV_IPI_1_BIT_MASK,
				XPAR_PSV_IPI_1_BUFFER_INDEX
			},
			{
				XPAR_PSV_IPI_2_BIT_MASK,
				XPAR_PSV_IPI_2_BUFFER_INDEX
			},
			{
				XPAR_PSV_IPI_3_BIT_MASK,
				XPAR_PSV_IPI_3_BUFFER_INDEX
			},
			{
				XPAR_PSV_IPI_4_BIT_MASK,
				XPAR_PSV_IPI_4_BUFFER_INDEX
			},
			{
				XPAR_PSV_IPI_5_BIT_MASK,
				XPAR_PSV_IPI_5_BUFFER_INDEX
			},
			{
				XPAR_PSV_IPI_6_BIT_MASK,
				XPAR_PSV_IPI_6_BUFFER_INDEX
			},
			{
				XPAR_PSV_IPI_PMC_BIT_MASK,
				XPAR_PSV_IPI_PMC_BUFFER_INDEX
			},
			{
				XPAR_PSV_IPI_PMC_NOBUF_BIT_MASK,
				XPAR_PSV_IPI_PMC_NOBUF_BUFFER_INDEX
			},
			{
				XPAR_PSV_IPI_PSM_BIT_MASK,
				XPAR_PSV_IPI_PSM_BUFFER_INDEX
			}
		}
	}
};
