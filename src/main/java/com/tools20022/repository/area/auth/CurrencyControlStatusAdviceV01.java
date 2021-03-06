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

package com.tools20022.repository.area.auth;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.AuthoritiesLatestVersion;
import com.tools20022.repository.msg.CurrencyControlGroupStatus1;
import com.tools20022.repository.msg.CurrencyControlHeader2;
import com.tools20022.repository.msg.CurrencyControlPackageStatus1;
import com.tools20022.repository.msg.SupplementaryData1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.*;

/**
 * The CurrencyControlStatusAdvice message is sent by either the reporting party
 * (respectively the registration agent or the registration agent (respectively
 * the reporting party) to provide a status advice on a previously sent currency
 * control message.<br>
 * <br>
 * Usage: <br>
 * The message may be sent in response to requests on the registration of the
 * currency control contract, supporting document or on the payment regulatory
 * information notification.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.CurrencyControlStatusAdviceV01#mmGroupHeader
 * CurrencyControlStatusAdviceV01.mmGroupHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.CurrencyControlStatusAdviceV01#mmGroupStatus
 * CurrencyControlStatusAdviceV01.mmGroupStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.CurrencyControlStatusAdviceV01#mmPackageStatus
 * CurrencyControlStatusAdviceV01.mmPackageStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.auth.CurrencyControlStatusAdviceV01#mmSupplementaryData
 * CurrencyControlStatusAdviceV01.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "CcyCtrlStsAdvc"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.AuthoritiesLatestVersion
 * AuthoritiesLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code auth.027.001.01}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CurrencyControlStatusAdviceV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The CurrencyControlStatusAdvice message is sent by either the reporting party (respectively the registration agent or the registration agent (respectively the reporting party) to provide a status advice on a previously sent currency control message.\r\n\r\nUsage: \r\nThe message may be sent in response to requests on the registration of the currency control contract, supporting document or on the payment regulatory information notification."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CurrencyControlStatusAdviceV01", propOrder = {"groupHeader", "groupStatus", "packageStatus", "supplementaryData"})
public class CurrencyControlStatusAdviceV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "GrpHdr", required = true)
	protected CurrencyControlHeader2 groupHeader;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyControlHeader2
	 * CurrencyControlHeader2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GrpHdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupHeader"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Characteristics shared by all individual items included in the message."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CurrencyControlStatusAdviceV01, CurrencyControlHeader2> mmGroupHeader = new MMMessageBuildingBlock<CurrencyControlStatusAdviceV01, CurrencyControlHeader2>() {
		{
			xmlTag = "GrpHdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupHeader";
			definition = "Characteristics shared by all individual items included in the message.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CurrencyControlHeader2.mmObject();
		}

		@Override
		public CurrencyControlHeader2 getValue(CurrencyControlStatusAdviceV01 obj) {
			return obj.getGroupHeader();
		}

		@Override
		public void setValue(CurrencyControlStatusAdviceV01 obj, CurrencyControlHeader2 value) {
			obj.setGroupHeader(value);
		}
	};
	@XmlElement(name = "GrpSts", required = true)
	protected List<CurrencyControlGroupStatus1> groupStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyControlGroupStatus1
	 * CurrencyControlGroupStatus1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GrpSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the group status for the global message."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CurrencyControlStatusAdviceV01, List<CurrencyControlGroupStatus1>> mmGroupStatus = new MMMessageBuildingBlock<CurrencyControlStatusAdviceV01, List<CurrencyControlGroupStatus1>>() {
		{
			xmlTag = "GrpSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupStatus";
			definition = "Provides the group status for the global message.";
			minOccurs = 1;
			complexType_lazy = () -> CurrencyControlGroupStatus1.mmObject();
		}

		@Override
		public List<CurrencyControlGroupStatus1> getValue(CurrencyControlStatusAdviceV01 obj) {
			return obj.getGroupStatus();
		}

		@Override
		public void setValue(CurrencyControlStatusAdviceV01 obj, List<CurrencyControlGroupStatus1> value) {
			obj.setGroupStatus(value);
		}
	};
	@XmlElement(name = "PackgSts")
	protected List<CurrencyControlPackageStatus1> packageStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CurrencyControlPackageStatus1
	 * CurrencyControlPackageStatus1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PackgSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PackageStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the status of the package in the message, which may contain the individual records."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CurrencyControlStatusAdviceV01, List<CurrencyControlPackageStatus1>> mmPackageStatus = new MMMessageBuildingBlock<CurrencyControlStatusAdviceV01, List<CurrencyControlPackageStatus1>>() {
		{
			xmlTag = "PackgSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PackageStatus";
			definition = "Provides the status of the package in the message, which may contain the individual records.";
			minOccurs = 0;
			complexType_lazy = () -> CurrencyControlPackageStatus1.mmObject();
		}

		@Override
		public List<CurrencyControlPackageStatus1> getValue(CurrencyControlStatusAdviceV01 obj) {
			return obj.getPackageStatus();
		}

		@Override
		public void setValue(CurrencyControlStatusAdviceV01 obj, List<CurrencyControlPackageStatus1> value) {
			obj.setPackageStatus(value);
		}
	};
	@XmlElement(name = "SplmtryData")
	protected List<SupplementaryData1> supplementaryData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SupplementaryData1
	 * SupplementaryData1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SplmtryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that cannot be captured in the structured elements and/or any other specific block."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<CurrencyControlStatusAdviceV01, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<CurrencyControlStatusAdviceV01, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(CurrencyControlStatusAdviceV01 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(CurrencyControlStatusAdviceV01 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CurrencyControlStatusAdviceV01";
				definition = "The CurrencyControlStatusAdvice message is sent by either the reporting party (respectively the registration agent or the registration agent (respectively the reporting party) to provide a status advice on a previously sent currency control message.\r\n\r\nUsage: \r\nThe message may be sent in response to requests on the registration of the currency control contract, supporting document or on the payment regulatory information notification.";
				rootElement = "Document";
				xmlTag = "CcyCtrlStsAdvc";
				businessArea_lazy = () -> AuthoritiesLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.auth.CurrencyControlStatusAdviceV01.mmGroupHeader, com.tools20022.repository.area.auth.CurrencyControlStatusAdviceV01.mmGroupStatus,
						com.tools20022.repository.area.auth.CurrencyControlStatusAdviceV01.mmPackageStatus, com.tools20022.repository.area.auth.CurrencyControlStatusAdviceV01.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "auth";
						messageFunctionality = "027";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return CurrencyControlStatusAdviceV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	public CurrencyControlHeader2 getGroupHeader() {
		return groupHeader;
	}

	public CurrencyControlStatusAdviceV01 setGroupHeader(CurrencyControlHeader2 groupHeader) {
		this.groupHeader = Objects.requireNonNull(groupHeader);
		return this;
	}

	public List<CurrencyControlGroupStatus1> getGroupStatus() {
		return groupStatus == null ? groupStatus = new ArrayList<>() : groupStatus;
	}

	public CurrencyControlStatusAdviceV01 setGroupStatus(List<CurrencyControlGroupStatus1> groupStatus) {
		this.groupStatus = Objects.requireNonNull(groupStatus);
		return this;
	}

	public List<CurrencyControlPackageStatus1> getPackageStatus() {
		return packageStatus == null ? packageStatus = new ArrayList<>() : packageStatus;
	}

	public CurrencyControlStatusAdviceV01 setPackageStatus(List<CurrencyControlPackageStatus1> packageStatus) {
		this.packageStatus = Objects.requireNonNull(packageStatus);
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public CurrencyControlStatusAdviceV01 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:auth.027.001.01")
	static public class Document {
		@XmlElement(name = "CcyCtrlStsAdvc", required = true)
		public CurrencyControlStatusAdviceV01 messageBody;
	}
}