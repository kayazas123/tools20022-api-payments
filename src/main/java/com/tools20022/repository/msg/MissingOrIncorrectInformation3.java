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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.AMLIndicator;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Set of elements used to provide further information on the reason for the
 * unable to apply investigation.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MissingOrIncorrectInformation3#mmAntiMoneyLaunderingRequest
 * MissingOrIncorrectInformation3.mmAntiMoneyLaunderingRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MissingOrIncorrectInformation3#mmMissingInformation
 * MissingOrIncorrectInformation3.mmMissingInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MissingOrIncorrectInformation3#mmIncorrectInformation
 * MissingOrIncorrectInformation3.mmIncorrectInformation}</li>
 * </ul>
 * </li>
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
 * "MissingOrIncorrectInformation3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of elements used to provide further information on the reason for the unable to apply investigation."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "MissingOrIncorrectInformation3", propOrder = {"antiMoneyLaunderingRequest", "missingInformation", "incorrectInformation"})
public class MissingOrIncorrectInformation3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected AMLIndicator antiMoneyLaunderingRequest;
	/**
	 * Indicates whether the request is related to an AML (Anti Money
	 * Laundering) investigation or not.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.AMLIndicator AMLIndicator}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MissingOrIncorrectInformation3
	 * MissingOrIncorrectInformation3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AMLReq"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AntiMoneyLaunderingRequest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the request is related to an AML (Anti Money Laundering) investigation or not."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAntiMoneyLaunderingRequest = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> MissingOrIncorrectInformation3.mmObject();
			isDerived = false;
			xmlTag = "AMLReq";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AntiMoneyLaunderingRequest";
			definition = "Indicates whether the request is related to an AML (Anti Money Laundering) investigation or not.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> AMLIndicator.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.UnableToApplyMissing1> missingInformation;
	/**
	 * Indicates the missing information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.UnableToApplyMissing1
	 * UnableToApplyMissing1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MissingOrIncorrectInformation3
	 * MissingOrIncorrectInformation3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MssngInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the missing information."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMissingInformation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> MissingOrIncorrectInformation3.mmObject();
			isDerived = false;
			xmlTag = "MssngInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingInformation";
			definition = "Indicates the missing information.";
			maxOccurs = 10;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.UnableToApplyMissing1.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.UnableToApplyIncorrect1> incorrectInformation;
	/**
	 * Indicates, in a coded form, the incorrect information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.UnableToApplyIncorrect1
	 * UnableToApplyIncorrect1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MissingOrIncorrectInformation3
	 * MissingOrIncorrectInformation3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IncrrctInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates, in a coded form, the incorrect information."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIncorrectInformation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> MissingOrIncorrectInformation3.mmObject();
			isDerived = false;
			xmlTag = "IncrrctInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectInformation";
			definition = "Indicates, in a coded form, the incorrect information.";
			maxOccurs = 10;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.UnableToApplyIncorrect1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(MissingOrIncorrectInformation3.mmAntiMoneyLaunderingRequest, MissingOrIncorrectInformation3.mmMissingInformation, MissingOrIncorrectInformation3.mmIncorrectInformation);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MissingOrIncorrectInformation3";
				definition = "Set of elements used to provide further information on the reason for the unable to apply investigation.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "AMLReq")
	public AMLIndicator getAntiMoneyLaunderingRequest() {
		return antiMoneyLaunderingRequest;
	}

	public void setAntiMoneyLaunderingRequest(AMLIndicator antiMoneyLaunderingRequest) {
		this.antiMoneyLaunderingRequest = antiMoneyLaunderingRequest;
	}

	@XmlElement(name = "MssngInf")
	public List<UnableToApplyMissing1> getMissingInformation() {
		return missingInformation;
	}

	public void setMissingInformation(List<com.tools20022.repository.msg.UnableToApplyMissing1> missingInformation) {
		this.missingInformation = missingInformation;
	}

	@XmlElement(name = "IncrrctInf")
	public List<UnableToApplyIncorrect1> getIncorrectInformation() {
		return incorrectInformation;
	}

	public void setIncorrectInformation(List<com.tools20022.repository.msg.UnableToApplyIncorrect1> incorrectInformation) {
		this.incorrectInformation = incorrectInformation;
	}
}