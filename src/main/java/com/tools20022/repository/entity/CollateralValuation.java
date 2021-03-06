/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.entity;

import com.tools20022.metamodel.*;
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.datatype.BaseOneRate;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.entity.Collateral;
import com.tools20022.repository.entity.CollateralManagement;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CashCollateral5;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Provides details about the valuation of each piece of collateral that is
 * posted.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CollateralValuation" src="doc-files/CollateralValuation.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralValuation#mmCollateral
 * CollateralValuation.mmCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralValuation#mmCollateralValuationDate
 * CollateralValuation.mmCollateralValuationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralValuation#mmRelatedManagementProcess
 * CollateralValuation.mmRelatedManagementProcess}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralValuation#mmReportedCurrencyAndAmount
 * CollateralValuation.mmReportedCurrencyAndAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralValuation#mmMarketValueAmount
 * CollateralValuation.mmMarketValueAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralValuation#mmAdjustedRate
 * CollateralValuation.mmAdjustedRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralValuation#mmCollateralValuationCurrency
 * CollateralValuation.mmCollateralValuationCurrency}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Collateral#mmValuation
 * Collateral.mmValuation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CollateralManagement#mmCollateralValuation
 * CollateralManagement.mmCollateralValuation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CollateralValuation"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides details about the valuation of each piece of collateral that is posted."
 * </li>
 * </ul>
 */
public class CollateralValuation {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected List<Collateral> collateral;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Collateral#mmValuation
	 * Collateral.mmValuation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Collateral
	 * Collateral}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CollateralValuation
	 * CollateralValuation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Collateral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Collateral which is the subject of the valuation."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CollateralValuation, List<Collateral>> mmCollateral = new MMBusinessAssociationEnd<CollateralValuation, List<Collateral>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CollateralValuation.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Collateral";
			definition = "Collateral which is the subject of the valuation.";
			minOccurs = 0;
			opposite_lazy = () -> Collateral.mmValuation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Collateral.mmObject();
		}

		@Override
		public List<Collateral> getValue(CollateralValuation obj) {
			return obj.getCollateral();
		}

		@Override
		public void setValue(CollateralValuation obj, List<Collateral> value) {
			obj.setCollateral(value);
		}
	};
	protected ISODateTime collateralValuationDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashCollateral5#mmValueDate
	 * CashCollateral5.mmValueDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CollateralValuation
	 * CollateralValuation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralValuationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Valuation date of the collateral."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CollateralValuation, ISODateTime> mmCollateralValuationDate = new MMBusinessAttribute<CollateralValuation, ISODateTime>() {
		{
			derivation_lazy = () -> Arrays.asList(CashCollateral5.mmValueDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CollateralValuation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CollateralValuationDate";
			definition = "Valuation date of the collateral.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		@Override
		public ISODateTime getValue(CollateralValuation obj) {
			return obj.getCollateralValuationDate();
		}

		@Override
		public void setValue(CollateralValuation obj, ISODateTime value) {
			obj.setCollateralValuationDate(value);
		}
	};
	protected CollateralManagement relatedManagementProcess;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CollateralManagement#mmCollateralValuation
	 * CollateralManagement.mmCollateralValuation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CollateralManagement
	 * CollateralManagement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CollateralValuation
	 * CollateralValuation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedManagementProcess"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Process which groups the activities related to collateral."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CollateralValuation, Optional<CollateralManagement>> mmRelatedManagementProcess = new MMBusinessAssociationEnd<CollateralValuation, Optional<CollateralManagement>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CollateralValuation.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedManagementProcess";
			definition = "Process which groups the activities related to collateral.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> CollateralManagement.mmCollateralValuation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CollateralManagement.mmObject();
		}

		@Override
		public Optional<CollateralManagement> getValue(CollateralValuation obj) {
			return obj.getRelatedManagementProcess();
		}

		@Override
		public void setValue(CollateralValuation obj, Optional<CollateralManagement> value) {
			obj.setRelatedManagementProcess(value.orElse(null));
		}
	};
	protected CurrencyAndAmount reportedCurrencyAndAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CollateralValuation
	 * CollateralValuation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportedCurrencyAndAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the total amount of the collateral in the reporting currency."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CollateralValuation, CurrencyAndAmount> mmReportedCurrencyAndAmount = new MMBusinessAttribute<CollateralValuation, CurrencyAndAmount>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CollateralValuation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ReportedCurrencyAndAmount";
			definition = "Specifies the total amount of the collateral in the reporting currency.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(CollateralValuation obj) {
			return obj.getReportedCurrencyAndAmount();
		}

		@Override
		public void setValue(CollateralValuation obj, CurrencyAndAmount value) {
			obj.setReportedCurrencyAndAmount(value);
		}
	};
	protected CurrencyAndAmount marketValueAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CollateralValuation
	 * CollateralValuation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketValueAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the total market to market value of the collateral in the reporting currency. It is the dirty price, that is, the accrued interest is included if any."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CollateralValuation, CurrencyAndAmount> mmMarketValueAmount = new MMBusinessAttribute<CollateralValuation, CurrencyAndAmount>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CollateralValuation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MarketValueAmount";
			definition = "Specifies the total market to market value of the collateral in the reporting currency. It is the dirty price, that is, the accrued interest is included if any.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(CollateralValuation obj) {
			return obj.getMarketValueAmount();
		}

		@Override
		public void setValue(CollateralValuation obj, CurrencyAndAmount value) {
			obj.setMarketValueAmount(value);
		}
	};
	protected BaseOneRate adjustedRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.BaseOneRate
	 * BaseOneRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CollateralValuation
	 * CollateralValuation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdjustedRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Percentage by which the collateral amount needs to be adjusted."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CollateralValuation, BaseOneRate> mmAdjustedRate = new MMBusinessAttribute<CollateralValuation, BaseOneRate>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CollateralValuation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AdjustedRate";
			definition = "Percentage by which the collateral amount needs to be adjusted.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BaseOneRate.mmObject();
		}

		@Override
		public BaseOneRate getValue(CollateralValuation obj) {
			return obj.getAdjustedRate();
		}

		@Override
		public void setValue(CollateralValuation obj, BaseOneRate value) {
			obj.setAdjustedRate(value);
		}
	};
	protected CurrencyCode collateralValuationCurrency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CollateralValuation
	 * CollateralValuation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralValuationCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency used for the valuation."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CollateralValuation, CurrencyCode> mmCollateralValuationCurrency = new MMBusinessAttribute<CollateralValuation, CurrencyCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CollateralValuation.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CollateralValuationCurrency";
			definition = "Currency used for the valuation.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}

		@Override
		public CurrencyCode getValue(CollateralValuation obj) {
			return obj.getCollateralValuationCurrency();
		}

		@Override
		public void setValue(CollateralValuation obj, CurrencyCode value) {
			obj.setCollateralValuationCurrency(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CollateralValuation";
				definition = "Provides details about the valuation of each piece of collateral that is posted.";
				associationDomain_lazy = () -> Arrays.asList(Collateral.mmValuation, CollateralManagement.mmCollateralValuation);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CollateralValuation.mmCollateral, com.tools20022.repository.entity.CollateralValuation.mmCollateralValuationDate,
						com.tools20022.repository.entity.CollateralValuation.mmRelatedManagementProcess, com.tools20022.repository.entity.CollateralValuation.mmReportedCurrencyAndAmount,
						com.tools20022.repository.entity.CollateralValuation.mmMarketValueAmount, com.tools20022.repository.entity.CollateralValuation.mmAdjustedRate,
						com.tools20022.repository.entity.CollateralValuation.mmCollateralValuationCurrency);
			}

			@Override
			public Class<?> getInstanceClass() {
				return CollateralValuation.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<Collateral> getCollateral() {
		return collateral == null ? collateral = new ArrayList<>() : collateral;
	}

	public CollateralValuation setCollateral(List<Collateral> collateral) {
		this.collateral = Objects.requireNonNull(collateral);
		return this;
	}

	public ISODateTime getCollateralValuationDate() {
		return collateralValuationDate;
	}

	public CollateralValuation setCollateralValuationDate(ISODateTime collateralValuationDate) {
		this.collateralValuationDate = Objects.requireNonNull(collateralValuationDate);
		return this;
	}

	public Optional<CollateralManagement> getRelatedManagementProcess() {
		return relatedManagementProcess == null ? Optional.empty() : Optional.of(relatedManagementProcess);
	}

	public CollateralValuation setRelatedManagementProcess(CollateralManagement relatedManagementProcess) {
		this.relatedManagementProcess = relatedManagementProcess;
		return this;
	}

	public CurrencyAndAmount getReportedCurrencyAndAmount() {
		return reportedCurrencyAndAmount;
	}

	public CollateralValuation setReportedCurrencyAndAmount(CurrencyAndAmount reportedCurrencyAndAmount) {
		this.reportedCurrencyAndAmount = Objects.requireNonNull(reportedCurrencyAndAmount);
		return this;
	}

	public CurrencyAndAmount getMarketValueAmount() {
		return marketValueAmount;
	}

	public CollateralValuation setMarketValueAmount(CurrencyAndAmount marketValueAmount) {
		this.marketValueAmount = Objects.requireNonNull(marketValueAmount);
		return this;
	}

	public BaseOneRate getAdjustedRate() {
		return adjustedRate;
	}

	public CollateralValuation setAdjustedRate(BaseOneRate adjustedRate) {
		this.adjustedRate = Objects.requireNonNull(adjustedRate);
		return this;
	}

	public CurrencyCode getCollateralValuationCurrency() {
		return collateralValuationCurrency;
	}

	public CollateralValuation setCollateralValuationCurrency(CurrencyCode collateralValuationCurrency) {
		this.collateralValuationCurrency = Objects.requireNonNull(collateralValuationCurrency);
		return this;
	}
}