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

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.Tax;
import com.tools20022.repository.entity.TaxRecord;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Set of elements used to define the tax record.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TaxRecord1#mmType
 * TaxRecord1.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxRecord1#mmCategory
 * TaxRecord1.mmCategory}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxRecord1#mmCategoryDetails
 * TaxRecord1.mmCategoryDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxRecord1#mmDebtorStatus
 * TaxRecord1.mmDebtorStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TaxRecord1#mmCertificateIdentification
 * TaxRecord1.mmCertificateIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxRecord1#mmFormsCode
 * TaxRecord1.mmFormsCode}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxRecord1#mmPeriod
 * TaxRecord1.mmPeriod}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxRecord1#mmTaxAmount
 * TaxRecord1.mmTaxAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TaxRecord1#mmAdditionalInformation
 * TaxRecord1.mmAdditionalInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.TaxRecord TaxRecord}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TaxRecord1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Set of elements used to define the tax record."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "TaxRecord1", propOrder = {"type", "category", "categoryDetails", "debtorStatus", "certificateIdentification", "formsCode", "period", "taxAmount", "additionalInformation"})
public class TaxRecord1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text type;
	/**
	 * High level code to identify the type of tax details.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TaxRecord#mmTaxRecordType
	 * TaxRecord.mmTaxRecordType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TaxRecord1
	 * TaxRecord1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "High level code to identify the type of tax details."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TaxRecord.mmTaxRecordType;
			componentContext_lazy = () -> TaxRecord1.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "High level code to identify the type of tax details.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text category;
	/**
	 * Specifies the tax code as published by the tax authority.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TaxRecord#mmCategory
	 * TaxRecord.mmCategory}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TaxRecord1
	 * TaxRecord1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ctgy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Category"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the tax code as published by the tax authority."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCategory = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TaxRecord.mmCategory;
			componentContext_lazy = () -> TaxRecord1.mmObject();
			isDerived = false;
			xmlTag = "Ctgy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Category";
			definition = "Specifies the tax code as published by the tax authority.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text categoryDetails;
	/**
	 * Provides further details of the category tax code.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TaxRecord1
	 * TaxRecord1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtgyDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CategoryDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides further details of the category tax code."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCategoryDetails = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TaxRecord1.mmObject();
			isDerived = false;
			xmlTag = "CtgyDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CategoryDetails";
			definition = "Provides further details of the category tax code.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text debtorStatus;
	/**
	 * Code provided by local authority to identify the status of the party that
	 * has drawn up the settlement document.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TaxRecord#mmStatus
	 * TaxRecord.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TaxRecord1
	 * TaxRecord1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DbtrSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebtorStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Code provided by local authority to identify the status of the party that has drawn up the settlement document."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDebtorStatus = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TaxRecord.mmStatus;
			componentContext_lazy = () -> TaxRecord1.mmObject();
			isDerived = false;
			xmlTag = "DbtrSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebtorStatus";
			definition = "Code provided by local authority to identify the status of the party that has drawn up the settlement document.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text certificateIdentification;
	/**
	 * Identification number of the tax report as assigned by the taxing
	 * authority.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmCertificateIdentification
	 * Tax.mmCertificateIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TaxRecord1
	 * TaxRecord1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CertId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificateIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification number of the tax report as assigned by the taxing authority."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCertificateIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Tax.mmCertificateIdentification;
			componentContext_lazy = () -> TaxRecord1.mmObject();
			isDerived = false;
			xmlTag = "CertId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificateIdentification";
			definition = "Identification number of the tax report as assigned by the taxing authority.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text formsCode;
	/**
	 * Identifies, in a coded form, on which template the tax report is to be
	 * provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TaxRecord#mmFormsCode
	 * TaxRecord.mmFormsCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TaxRecord1
	 * TaxRecord1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrmsCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FormsCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies, in a coded form, on which template the tax report is to be provided."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFormsCode = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TaxRecord.mmFormsCode;
			componentContext_lazy = () -> TaxRecord1.mmObject();
			isDerived = false;
			xmlTag = "FrmsCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FormsCode";
			definition = "Identifies, in a coded form, on which template the tax report is to be provided.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected TaxPeriod1 period;
	/**
	 * Set of elements used to provide details on the period of time related to
	 * the tax payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TaxPeriod1 TaxPeriod1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TaxRecord#mmPeriod
	 * TaxRecord.mmPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TaxRecord1
	 * TaxRecord1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Prd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Period"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements used to provide details on the period of time related to the tax payment."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPeriod = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> TaxRecord.mmPeriod;
			componentContext_lazy = () -> TaxRecord1.mmObject();
			isDerived = false;
			xmlTag = "Prd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Period";
			definition = "Set of elements used to provide details on the period of time related to the tax payment.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TaxPeriod1.mmObject();
		}
	};
	protected TaxAmount1 taxAmount;
	/**
	 * Set of elements used to provide information on the amount of the tax
	 * record.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TaxAmount1 TaxAmount1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TaxRecord#mmTax
	 * TaxRecord.mmTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TaxRecord1
	 * TaxRecord1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements used to provide information on the amount of the tax record."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTaxAmount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> TaxRecord.mmTax;
			componentContext_lazy = () -> TaxRecord1.mmObject();
			isDerived = false;
			xmlTag = "TaxAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxAmount";
			definition = "Set of elements used to provide information on the amount of the tax record.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TaxAmount1.mmObject();
		}
	};
	protected Max140Text additionalInformation;
	/**
	 * Further details of the tax record.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.TaxRecord1
	 * TaxRecord1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Further details of the tax record."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAdditionalInformation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TaxRecord1.mmObject();
			isDerived = false;
			xmlTag = "AddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Further details of the tax record.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(TaxRecord1.mmType, TaxRecord1.mmCategory, TaxRecord1.mmCategoryDetails, TaxRecord1.mmDebtorStatus, TaxRecord1.mmCertificateIdentification, TaxRecord1.mmFormsCode,
						TaxRecord1.mmPeriod, TaxRecord1.mmTaxAmount, TaxRecord1.mmAdditionalInformation);
				trace_lazy = () -> TaxRecord.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TaxRecord1";
				definition = "Set of elements used to define the tax record.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Tp")
	public Max35Text getType() {
		return type;
	}

	public void setType(Max35Text type) {
		this.type = type;
	}

	@XmlElement(name = "Ctgy")
	public Max35Text getCategory() {
		return category;
	}

	public void setCategory(Max35Text category) {
		this.category = category;
	}

	@XmlElement(name = "CtgyDtls")
	public Max35Text getCategoryDetails() {
		return categoryDetails;
	}

	public void setCategoryDetails(Max35Text categoryDetails) {
		this.categoryDetails = categoryDetails;
	}

	@XmlElement(name = "DbtrSts")
	public Max35Text getDebtorStatus() {
		return debtorStatus;
	}

	public void setDebtorStatus(Max35Text debtorStatus) {
		this.debtorStatus = debtorStatus;
	}

	@XmlElement(name = "CertId")
	public Max35Text getCertificateIdentification() {
		return certificateIdentification;
	}

	public void setCertificateIdentification(Max35Text certificateIdentification) {
		this.certificateIdentification = certificateIdentification;
	}

	@XmlElement(name = "FrmsCd")
	public Max35Text getFormsCode() {
		return formsCode;
	}

	public void setFormsCode(Max35Text formsCode) {
		this.formsCode = formsCode;
	}

	@XmlElement(name = "Prd")
	public TaxPeriod1 getPeriod() {
		return period;
	}

	public void setPeriod(com.tools20022.repository.msg.TaxPeriod1 period) {
		this.period = period;
	}

	@XmlElement(name = "TaxAmt")
	public TaxAmount1 getTaxAmount() {
		return taxAmount;
	}

	public void setTaxAmount(com.tools20022.repository.msg.TaxAmount1 taxAmount) {
		this.taxAmount = taxAmount;
	}

	@XmlElement(name = "AddtlInf")
	public Max140Text getAdditionalInformation() {
		return additionalInformation;
	}

	public void setAdditionalInformation(Max140Text additionalInformation) {
		this.additionalInformation = additionalInformation;
	}
}