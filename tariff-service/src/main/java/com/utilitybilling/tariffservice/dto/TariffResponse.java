package com.utilitybilling.tariffservice.dto;

import com.utilitybilling.tariffservice.model.*;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
@Builder
public class TariffResponse {
	private UtilityType utilityType;
	private TariffPlan plan;
	private boolean active;
	private List<TariffSlab> slabs;
	private double fixedCharge;
	private double taxPercentage;
	private List<OverduePenaltySlab> overduePenaltySlabs;
	private LocalDate effectiveFrom;
}
