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

package com.tools20022.repository.area.pain;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.PaymentsInitiationLatestVersion;
import com.tools20022.repository.msg.GroupHeader47;
import com.tools20022.repository.msg.MandateCancellation5;
import com.tools20022.repository.msg.SupplementaryData1;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The MandateCancellationRequest message is sent by the initiator of the
 * request to his agent. The initiator can either be the debtor or the creditor.<br>
 * The MandateCancellationRequest message is forwarded by the agent of the
 * initiator to the agent of the counterparty.<br>
 * A MandateCancellationRequest message is used to request the cancellation of
 * an existing mandate. If accepted, this MandateCancellationRequest message
 * together with the MandateAcceptanceReport message confirming the acceptance
 * will be considered a valid cancellation of an existing mandate, agreed upon
 * by all parties.<br>
 * <b>Usage</b><br>
 * The MandateCancellationRequest message can contain one or more request(s) to
 * cancel a specific mandate.<br>
 * The messages can be exchanged between creditor and creditor agent or debtor
 * and debtor agent and between creditor agent and debtor agent.<br>
 * The message can also be used by an initiating party that has authority to
 * send the message on behalf of the creditor or debtor.<br>
 * The MandateCancellationRequest message can be used in domestic and
 * cross-border scenarios.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.PaymentsInitiationLatestVersion
 * PaymentsInitiationLatestVersion}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "MndtCxlReq"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.MandateCancellationRequestV05#mmGroupHeader
 * MandateCancellationRequestV05.mmGroupHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.MandateCancellationRequestV05#mmUnderlyingCancellationDetails
 * MandateCancellationRequestV05.mmUnderlyingCancellationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.MandateCancellationRequestV05#mmSupplementaryData
 * MandateCancellationRequestV05.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code pain.011.001.05}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MandateCancellationRequestV05"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe MandateCancellationRequest message is sent by the initiator of the request to his agent. The initiator can either be the debtor or the creditor.\r\nThe MandateCancellationRequest message is forwarded by the agent of the initiator to the agent of the counterparty.\r\nA MandateCancellationRequest message is used to request the cancellation of an existing mandate. If accepted, this MandateCancellationRequest message together with the MandateAcceptanceReport message confirming the acceptance will be considered a valid cancellation of an existing mandate, agreed upon by all parties.\r\nUsage\r\nThe MandateCancellationRequest message can contain one or more request(s) to cancel a specific mandate.\r\nThe messages can be exchanged between creditor and creditor agent or debtor and debtor agent and between creditor agent and debtor agent.\r\nThe message can also be used by an initiating party that has authority to send the message on behalf of the creditor or debtor.\r\nThe MandateCancellationRequest message can be used in domestic and cross-border scenarios."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "MandateCancellationRequestV05", propOrder = {"groupHeader", "underlyingCancellationDetails", "supplementaryData"})
public class MandateCancellationRequestV05 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected GroupHeader47 groupHeader;
	/**
	 * Set of characteristics to identify the message and parties playing a role
	 * in the cancellation of the mandate, but which are not part of the
	 * mandate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.GroupHeader47
	 * GroupHeader47}</li>
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
	 * "Set of characteristics to identify the message and parties playing a role in the cancellation of the mandate, but which are not part of the mandate."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmGroupHeader = new MMMessageBuildingBlock() {
		{
			xmlTag = "GrpHdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupHeader";
			definition = "Set of characteristics to identify the message and parties playing a role in the cancellation of the mandate, but which are not part of the mandate.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> GroupHeader47.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return MandateCancellationRequestV05.class.getMethod("getGroupHeader", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<MandateCancellation5> underlyingCancellationDetails;
	/**
	 * Set of elements used to provide details on the cancellation request.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MandateCancellation5
	 * MandateCancellation5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UndrlygCxlDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderlyingCancellationDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements used to provide details on the cancellation request."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmUnderlyingCancellationDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "UndrlygCxlDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderlyingCancellationDetails";
			definition = "Set of elements used to provide details on the cancellation request.";
			minOccurs = 1;
			complexType_lazy = () -> MandateCancellation5.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return MandateCancellationRequestV05.class.getMethod("getUnderlyingCancellationDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<SupplementaryData1> supplementaryData;
	/**
	 * Additional information that cannot be captured in the structured elements
	 * and/or any other specific block.
	 * <p>
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
	public static final MMMessageBuildingBlock mmSupplementaryData = new MMMessageBuildingBlock() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return MandateCancellationRequestV05.class.getMethod("getSupplementaryData", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MandateCancellationRequestV05";
				definition = "Scope\r\nThe MandateCancellationRequest message is sent by the initiator of the request to his agent. The initiator can either be the debtor or the creditor.\r\nThe MandateCancellationRequest message is forwarded by the agent of the initiator to the agent of the counterparty.\r\nA MandateCancellationRequest message is used to request the cancellation of an existing mandate. If accepted, this MandateCancellationRequest message together with the MandateAcceptanceReport message confirming the acceptance will be considered a valid cancellation of an existing mandate, agreed upon by all parties.\r\nUsage\r\nThe MandateCancellationRequest message can contain one or more request(s) to cancel a specific mandate.\r\nThe messages can be exchanged between creditor and creditor agent or debtor and debtor agent and between creditor agent and debtor agent.\r\nThe message can also be used by an initiating party that has authority to send the message on behalf of the creditor or debtor.\r\nThe MandateCancellationRequest message can be used in domestic and cross-border scenarios.";
				rootElement = "Document";
				xmlTag = "MndtCxlReq";
				businessArea_lazy = () -> PaymentsInitiationLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.pain.MandateCancellationRequestV05.mmGroupHeader,
						com.tools20022.repository.area.pain.MandateCancellationRequestV05.mmUnderlyingCancellationDetails, com.tools20022.repository.area.pain.MandateCancellationRequestV05.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "pain";
						messageFunctionality = "011";
						version = "05";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return MandateCancellationRequestV05.class;
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "GrpHdr", required = true)
	public GroupHeader47 getGroupHeader() {
		return groupHeader;
	}

	public void setGroupHeader(GroupHeader47 groupHeader) {
		this.groupHeader = groupHeader;
	}

	@XmlElement(name = "UndrlygCxlDtls", required = true)
	public List<MandateCancellation5> getUnderlyingCancellationDetails() {
		return underlyingCancellationDetails;
	}

	public void setUnderlyingCancellationDetails(List<MandateCancellation5> underlyingCancellationDetails) {
		this.underlyingCancellationDetails = underlyingCancellationDetails;
	}

	@XmlElement(name = "SplmtryData")
	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData;
	}

	public void setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = supplementaryData;
	}

	@XmlRootElement(namespace = "urn:iso:std:iso:20022:tech:xsd:pain.011.05.05")
	static public class Document {
		@XmlElement(name = "MndtCxlReq", required = true)
		public MandateCancellationRequestV05 messageBody;
	}
}