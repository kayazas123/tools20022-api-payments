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
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.pain.MandateCopyRequestV01;
import com.tools20022.repository.choice.MandateStatus1Choice;
import com.tools20022.repository.choice.OriginalMandate4Choice;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.OriginalMessageInformation1;
import com.tools20022.repository.msg.SupplementaryData1;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Identifies the mandate, for which a copy of the details is requested.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateCopy1#mmOriginalMessageInformation
 * MandateCopy1.mmOriginalMessageInformation}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MandateCopy1#mmOriginalMandate
 * MandateCopy1.mmOriginalMandate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MandateCopy1#mmMandateStatus
 * MandateCopy1.mmMandateStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateCopy1#mmSupplementaryData
 * MandateCopy1.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.MandateCopyRequestV01#mmUnderlyingCopyRequestDetails
 * MandateCopyRequestV01.mmUnderlyingCopyRequestDetails}</li>
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
 * "MandateCopy1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Identifies the mandate, for which a copy of the details is requested."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "MandateCopy1", propOrder = {"originalMessageInformation", "originalMandate", "mandateStatus", "supplementaryData"})
public class MandateCopy1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "OrgnlMsgInf")
	protected OriginalMessageInformation1 originalMessageInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.OriginalMessageInformation1
	 * OriginalMessageInformation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MandateCopy1 MandateCopy1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlMsgInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalMessageInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides information on the original message."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<MandateCopy1, Optional<OriginalMessageInformation1>> mmOriginalMessageInformation = new MMMessageAssociationEnd<MandateCopy1, Optional<OriginalMessageInformation1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MandateCopy1.mmObject();
			isDerived = false;
			xmlTag = "OrgnlMsgInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalMessageInformation";
			definition = "Provides information on the original message.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> OriginalMessageInformation1.mmObject();
		}

		@Override
		public Optional<OriginalMessageInformation1> getValue(MandateCopy1 obj) {
			return obj.getOriginalMessageInformation();
		}

		@Override
		public void setValue(MandateCopy1 obj, Optional<OriginalMessageInformation1> value) {
			obj.setOriginalMessageInformation(value.orElse(null));
		}
	};
	@XmlElement(name = "OrgnlMndt", required = true)
	protected OriginalMandate4Choice originalMandate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.OriginalMandate4Choice
	 * OriginalMandate4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MandateCopy1 MandateCopy1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlMndt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalMandate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the original mandate data."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<MandateCopy1, OriginalMandate4Choice> mmOriginalMandate = new MMMessageAssociationEnd<MandateCopy1, OriginalMandate4Choice>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MandateCopy1.mmObject();
			isDerived = false;
			xmlTag = "OrgnlMndt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalMandate";
			definition = "Provides the original mandate data.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> OriginalMandate4Choice.mmObject();
		}

		@Override
		public OriginalMandate4Choice getValue(MandateCopy1 obj) {
			return obj.getOriginalMandate();
		}

		@Override
		public void setValue(MandateCopy1 obj, OriginalMandate4Choice value) {
			obj.setOriginalMandate(value);
		}
	};
	@XmlElement(name = "MndtSts")
	protected MandateStatus1Choice mandateStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.MandateStatus1Choice
	 * MandateStatus1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MandateCopy1 MandateCopy1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MndtSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MandateStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the status of the mandate."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<MandateCopy1, Optional<MandateStatus1Choice>> mmMandateStatus = new MMMessageAssociationEnd<MandateCopy1, Optional<MandateStatus1Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MandateCopy1.mmObject();
			isDerived = false;
			xmlTag = "MndtSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MandateStatus";
			definition = "Indicates the status of the mandate.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> MandateStatus1Choice.mmObject();
		}

		@Override
		public Optional<MandateStatus1Choice> getValue(MandateCopy1 obj) {
			return obj.getMandateStatus();
		}

		@Override
		public void setValue(MandateCopy1 obj, Optional<MandateStatus1Choice> value) {
			obj.setMandateStatus(value.orElse(null));
		}
	};
	@XmlElement(name = "SplmtryData")
	protected List<SupplementaryData1> supplementaryData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SupplementaryData1
	 * SupplementaryData1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MandateCopy1 MandateCopy1}</li>
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
	public static final MMMessageAssociationEnd<MandateCopy1, List<SupplementaryData1>> mmSupplementaryData = new MMMessageAssociationEnd<MandateCopy1, List<SupplementaryData1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MandateCopy1.mmObject();
			isDerived = false;
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(MandateCopy1 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(MandateCopy1 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MandateCopy1.mmOriginalMessageInformation, com.tools20022.repository.msg.MandateCopy1.mmOriginalMandate,
						com.tools20022.repository.msg.MandateCopy1.mmMandateStatus, com.tools20022.repository.msg.MandateCopy1.mmSupplementaryData);
				messageBuildingBlock_lazy = () -> Arrays.asList(MandateCopyRequestV01.mmUnderlyingCopyRequestDetails);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MandateCopy1";
				definition = "Identifies the mandate, for which a copy of the details is requested.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<OriginalMessageInformation1> getOriginalMessageInformation() {
		return originalMessageInformation == null ? Optional.empty() : Optional.of(originalMessageInformation);
	}

	public MandateCopy1 setOriginalMessageInformation(OriginalMessageInformation1 originalMessageInformation) {
		this.originalMessageInformation = originalMessageInformation;
		return this;
	}

	public OriginalMandate4Choice getOriginalMandate() {
		return originalMandate;
	}

	public MandateCopy1 setOriginalMandate(OriginalMandate4Choice originalMandate) {
		this.originalMandate = Objects.requireNonNull(originalMandate);
		return this;
	}

	public Optional<MandateStatus1Choice> getMandateStatus() {
		return mandateStatus == null ? Optional.empty() : Optional.of(mandateStatus);
	}

	public MandateCopy1 setMandateStatus(MandateStatus1Choice mandateStatus) {
		this.mandateStatus = mandateStatus;
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public MandateCopy1 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}
}