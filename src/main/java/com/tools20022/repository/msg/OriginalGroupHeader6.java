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
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.PaymentExecution;
import com.tools20022.repository.entity.PaymentIdentification;
import com.tools20022.repository.entity.PaymentStatus;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides details on the original group, to which the message refers.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader6#mmGroupCancellationIdentification
 * OriginalGroupHeader6.mmGroupCancellationIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OriginalGroupHeader6#mmCase
 * OriginalGroupHeader6.mmCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader6#mmOriginalMessageIdentification
 * OriginalGroupHeader6.mmOriginalMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader6#mmOriginalMessageNameIdentification
 * OriginalGroupHeader6.mmOriginalMessageNameIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader6#mmOriginalCreationDateTime
 * OriginalGroupHeader6.mmOriginalCreationDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader6#mmNumberOfTransactions
 * OriginalGroupHeader6.mmNumberOfTransactions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader6#mmControlSum
 * OriginalGroupHeader6.mmControlSum}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader6#mmGroupCancellation
 * OriginalGroupHeader6.mmGroupCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader6#mmCancellationReasonInformation
 * OriginalGroupHeader6.mmCancellationReasonInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.PaymentExecution
 * PaymentExecution}</li>
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
 * "OriginalGroupHeader6"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides details on the original group, to which the message refers."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "OriginalGroupHeader6", propOrder = {"groupCancellationIdentification", "case", "originalMessageIdentification", "originalMessageNameIdentification", "originalCreationDateTime", "numberOfTransactions", "controlSum",
		"groupCancellation", "cancellationReasonInformation"})
public class OriginalGroupHeader6 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text groupCancellationIdentification;
	/**
	 * Unique identification, as assigned by the assigner, to unambiguously
	 * identify the group cancellation request.
	 * 
	 * Usage: The group cancellation request identification can be used for
	 * reconciliation or to link tasks related to the cancellation request.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader6
	 * OriginalGroupHeader6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GrpCxlId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupCancellationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification, as assigned by the assigner, to unambiguously identify the group cancellation request.\n\nUsage: The group cancellation request identification can be used for reconciliation or to link tasks related to the cancellation request."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmGroupCancellationIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> OriginalGroupHeader6.mmObject();
			isDerived = false;
			xmlTag = "GrpCxlId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupCancellationIdentification";
			definition = "Unique identification, as assigned by the assigner, to unambiguously identify the group cancellation request.\n\nUsage: The group cancellation request identification can be used for reconciliation or to link tasks related to the cancellation request.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Case3 case_;
	/**
	 * Uniquely and unambiguously identifies an exception or an investigation
	 * workflow.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Case3 Case3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentExecution#mmRelatedInvestigationCase
	 * PaymentExecution.mmRelatedInvestigationCase}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader6
	 * OriginalGroupHeader6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Case"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Case"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Uniquely and unambiguously identifies an exception or an investigation workflow."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCase = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PaymentExecution.mmRelatedInvestigationCase;
			componentContext_lazy = () -> OriginalGroupHeader6.mmObject();
			isDerived = false;
			xmlTag = "Case";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Case";
			definition = "Uniquely and unambiguously identifies an exception or an investigation workflow.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Case3.mmObject();
		}
	};
	protected Max35Text originalMessageIdentification;
	/**
	 * Point to point reference, as assigned by the original instructing party,
	 * to unambiguously identify the original message.
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
	 * {@linkplain com.tools20022.repository.entity.PaymentIdentification#mmExecutionIdentification
	 * PaymentIdentification.mmExecutionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader6
	 * OriginalGroupHeader6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlMsgId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalMessageIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Point to point reference, as assigned by the original instructing party, to unambiguously identify the original message."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOriginalMessageIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PaymentIdentification.mmExecutionIdentification;
			componentContext_lazy = () -> OriginalGroupHeader6.mmObject();
			isDerived = false;
			xmlTag = "OrgnlMsgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalMessageIdentification";
			definition = "Point to point reference, as assigned by the original instructing party, to unambiguously identify the original message.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text originalMessageNameIdentification;
	/**
	 * Specifies the original message name identifier to which the message
	 * refers.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader6
	 * OriginalGroupHeader6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlMsgNmId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalMessageNameIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the original message name identifier to which the message refers."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOriginalMessageNameIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> OriginalGroupHeader6.mmObject();
			isDerived = false;
			xmlTag = "OrgnlMsgNmId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalMessageNameIdentification";
			definition = "Specifies the original message name identifier to which the message refers.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected ISODateTime originalCreationDateTime;
	/**
	 * Date and time at which the original message was created.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentExecution#mmCreationDate
	 * PaymentExecution.mmCreationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader6
	 * OriginalGroupHeader6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlCreDtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalCreationDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time at which the original message was created."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOriginalCreationDateTime = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PaymentExecution.mmCreationDate;
			componentContext_lazy = () -> OriginalGroupHeader6.mmObject();
			isDerived = false;
			xmlTag = "OrgnlCreDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalCreationDateTime";
			definition = "Date and time at which the original message was created.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected Max15NumericText numberOfTransactions;
	/**
	 * Number of individual transactions contained in the original message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max15NumericText
	 * Max15NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader6
	 * OriginalGroupHeader6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NbOfTxs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumberOfTransactions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of individual transactions contained in the original message."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNumberOfTransactions = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> OriginalGroupHeader6.mmObject();
			isDerived = false;
			xmlTag = "NbOfTxs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NumberOfTransactions";
			definition = "Number of individual transactions contained in the original message.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max15NumericText.mmObject();
		}
	};
	protected DecimalNumber controlSum;
	/**
	 * Total of all individual amounts included in the message, irrespective of
	 * currencies.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader6
	 * OriginalGroupHeader6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtrlSum"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ControlSum"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total of all individual amounts included in the message, irrespective of currencies."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmControlSum = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> OriginalGroupHeader6.mmObject();
			isDerived = false;
			xmlTag = "CtrlSum";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ControlSum";
			definition = "Total of all individual amounts included in the message, irrespective of currencies.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	protected GroupCancellationIndicator groupCancellation;
	/**
	 * Indicates whether the cancellation request applies to a whole group of
	 * transactions or to individual transactions within an original group.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.GroupCancellationIndicator
	 * GroupCancellationIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader6
	 * OriginalGroupHeader6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GrpCxl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GroupCancellation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the cancellation request applies to a whole group of transactions or to individual transactions within an original group."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmGroupCancellation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> OriginalGroupHeader6.mmObject();
			isDerived = false;
			xmlTag = "GrpCxl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GroupCancellation";
			definition = "Indicates whether the cancellation request applies to a whole group of transactions or to individual transactions within an original group.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> GroupCancellationIndicator.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.PaymentCancellationReason3> cancellationReasonInformation;
	/**
	 * Provides detailed information on the cancellation reason.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PaymentCancellationReason3
	 * PaymentCancellationReason3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentStatus#mmCancellationReason
	 * PaymentStatus.mmCancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.OriginalGroupHeader6
	 * OriginalGroupHeader6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CxlRsnInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationReasonInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides detailed information on the cancellation reason."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCancellationReasonInformation = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PaymentStatus.mmCancellationReason;
			componentContext_lazy = () -> OriginalGroupHeader6.mmObject();
			isDerived = false;
			xmlTag = "CxlRsnInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationReasonInformation";
			definition = "Provides detailed information on the cancellation reason.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PaymentCancellationReason3.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(OriginalGroupHeader6.mmGroupCancellationIdentification, OriginalGroupHeader6.mmCase, OriginalGroupHeader6.mmOriginalMessageIdentification,
						OriginalGroupHeader6.mmOriginalMessageNameIdentification, OriginalGroupHeader6.mmOriginalCreationDateTime, OriginalGroupHeader6.mmNumberOfTransactions, OriginalGroupHeader6.mmControlSum,
						OriginalGroupHeader6.mmGroupCancellation, OriginalGroupHeader6.mmCancellationReasonInformation);
				trace_lazy = () -> PaymentExecution.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OriginalGroupHeader6";
				definition = "Provides details on the original group, to which the message refers.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "GrpCxlId")
	public Max35Text getGroupCancellationIdentification() {
		return groupCancellationIdentification;
	}

	public void setGroupCancellationIdentification(Max35Text groupCancellationIdentification) {
		this.groupCancellationIdentification = groupCancellationIdentification;
	}

	@XmlElement(name = "Case")
	public Case3 getCase() {
		return case_;
	}

	public void setCase(com.tools20022.repository.msg.Case3 case_) {
		this.case_ = case_;
	}

	@XmlElement(name = "OrgnlMsgId", required = true)
	public Max35Text getOriginalMessageIdentification() {
		return originalMessageIdentification;
	}

	public void setOriginalMessageIdentification(Max35Text originalMessageIdentification) {
		this.originalMessageIdentification = originalMessageIdentification;
	}

	@XmlElement(name = "OrgnlMsgNmId", required = true)
	public Max35Text getOriginalMessageNameIdentification() {
		return originalMessageNameIdentification;
	}

	public void setOriginalMessageNameIdentification(Max35Text originalMessageNameIdentification) {
		this.originalMessageNameIdentification = originalMessageNameIdentification;
	}

	@XmlElement(name = "OrgnlCreDtTm")
	public ISODateTime getOriginalCreationDateTime() {
		return originalCreationDateTime;
	}

	public void setOriginalCreationDateTime(ISODateTime originalCreationDateTime) {
		this.originalCreationDateTime = originalCreationDateTime;
	}

	@XmlElement(name = "NbOfTxs")
	public Max15NumericText getNumberOfTransactions() {
		return numberOfTransactions;
	}

	public void setNumberOfTransactions(Max15NumericText numberOfTransactions) {
		this.numberOfTransactions = numberOfTransactions;
	}

	@XmlElement(name = "CtrlSum")
	public DecimalNumber getControlSum() {
		return controlSum;
	}

	public void setControlSum(DecimalNumber controlSum) {
		this.controlSum = controlSum;
	}

	@XmlElement(name = "GrpCxl")
	public GroupCancellationIndicator getGroupCancellation() {
		return groupCancellation;
	}

	public void setGroupCancellation(GroupCancellationIndicator groupCancellation) {
		this.groupCancellation = groupCancellation;
	}

	@XmlElement(name = "CxlRsnInf")
	public List<PaymentCancellationReason3> getCancellationReasonInformation() {
		return cancellationReasonInformation;
	}

	public void setCancellationReasonInformation(List<com.tools20022.repository.msg.PaymentCancellationReason3> cancellationReasonInformation) {
		this.cancellationReasonInformation = cancellationReasonInformation;
	}
}