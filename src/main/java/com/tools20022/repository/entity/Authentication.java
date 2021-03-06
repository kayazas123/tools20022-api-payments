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
import com.tools20022.repository.codeset.AuthenticationEntityCode;
import com.tools20022.repository.codeset.AuthenticationMethodCode;
import com.tools20022.repository.codeset.AuthenticationResultCode;
import com.tools20022.repository.codeset.PINFormatCode;
import com.tools20022.repository.datatype.Max140Binary;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max70Text;
import com.tools20022.repository.entity.CardholderRole;
import com.tools20022.repository.entity.Mandate;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CardholderAuthentication2;
import com.tools20022.repository.msg.MandateAuthentication1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;

/**
 * Data related to the authentication of the cardholder.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="Authentication" src="doc-files/Authentication.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Authentication#mmCardholder
 * Authentication.mmCardholder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Authentication#mmAuthenticationMethod
 * Authentication.mmAuthenticationMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Authentication#mmAuthenticationEntity
 * Authentication.mmAuthenticationEntity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Authentication#mmAuthenticationValue
 * Authentication.mmAuthenticationValue}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Authentication#mmPINFormat
 * Authentication.mmPINFormat}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Authentication#mmPIN
 * Authentication.mmPIN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Authentication#mmAuthenticationSupport
 * Authentication.mmAuthenticationSupport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Authentication#mmCollectionIndicator
 * Authentication.mmCollectionIndicator}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Authentication#mmMandate
 * Authentication.mmMandate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Authentication#mmAuthenticationResult
 * Authentication.mmAuthenticationResult}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardholderRole#mmAuthentication
 * CardholderRole.mmAuthentication}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Mandate#mmAuthentication
 * Mandate.mmAuthentication}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CardholderAuthentication2
 * CardholderAuthentication2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MandateAuthentication1
 * MandateAuthentication1}</li>
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
 * "Authentication"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Data related to the authentication of the cardholder."</li>
 * </ul>
 */
public class Authentication {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected CardholderRole cardholder;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CardholderRole#mmAuthentication
	 * CardholderRole.mmAuthentication}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CardholderRole
	 * CardholderRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Authentication
	 * Authentication}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cardholder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cardholder for which an authentication is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Authentication, Optional<CardholderRole>> mmCardholder = new MMBusinessAssociationEnd<Authentication, Optional<CardholderRole>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Authentication.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Cardholder";
			definition = "Cardholder for which an authentication is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> CardholderRole.mmAuthentication;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CardholderRole.mmObject();
		}

		@Override
		public Optional<CardholderRole> getValue(Authentication obj) {
			return obj.getCardholder();
		}

		@Override
		public void setValue(Authentication obj, Optional<CardholderRole> value) {
			obj.setCardholder(value.orElse(null));
		}
	};
	protected AuthenticationMethodCode authenticationMethod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationMethodCode
	 * AuthenticationMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication2#mmAuthenticationMethod
	 * CardholderAuthentication2.mmAuthenticationMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateAuthentication1#mmChannel
	 * MandateAuthentication1.mmChannel}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Authentication
	 * Authentication}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthenticationMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Method used to authenticate a person."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Authentication, AuthenticationMethodCode> mmAuthenticationMethod = new MMBusinessAttribute<Authentication, AuthenticationMethodCode>() {
		{
			derivation_lazy = () -> Arrays.asList(CardholderAuthentication2.mmAuthenticationMethod, MandateAuthentication1.mmChannel);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Authentication.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AuthenticationMethod";
			definition = "Method used to authenticate a person.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AuthenticationMethodCode.mmObject();
		}

		@Override
		public AuthenticationMethodCode getValue(Authentication obj) {
			return obj.getAuthenticationMethod();
		}

		@Override
		public void setValue(Authentication obj, AuthenticationMethodCode value) {
			obj.setAuthenticationMethod(value);
		}
	};
	protected AuthenticationEntityCode authenticationEntity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationEntityCode
	 * AuthenticationEntityCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardholderAuthentication2#mmAuthenticationEntity
	 * CardholderAuthentication2.mmAuthenticationEntity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.MandateAuthentication1#mmMessageAuthenticationCode
	 * MandateAuthentication1.mmMessageAuthenticationCode}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Authentication
	 * Authentication}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthenticationEntity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Entity or object in charge of verifying the person authenticity."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Authentication, AuthenticationEntityCode> mmAuthenticationEntity = new MMBusinessAttribute<Authentication, AuthenticationEntityCode>() {
		{
			derivation_lazy = () -> Arrays.asList(CardholderAuthentication2.mmAuthenticationEntity, MandateAuthentication1.mmMessageAuthenticationCode);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Authentication.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AuthenticationEntity";
			definition = "Entity or object in charge of verifying the person authenticity.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AuthenticationEntityCode.mmObject();
		}

		@Override
		public AuthenticationEntityCode getValue(Authentication obj) {
			return obj.getAuthenticationEntity();
		}

		@Override
		public void setValue(Authentication obj, AuthenticationEntityCode value) {
			obj.setAuthenticationEntity(value);
		}
	};
	protected Max70Text authenticationValue;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max70Text
	 * Max70Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Authentication
	 * Authentication}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthenticationValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Value used to authenticate the owner of the payment card."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Authentication, Max70Text> mmAuthenticationValue = new MMBusinessAttribute<Authentication, Max70Text>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Authentication.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AuthenticationValue";
			definition = "Value used to authenticate the owner of the payment card.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max70Text.mmObject();
		}

		@Override
		public Max70Text getValue(Authentication obj) {
			return obj.getAuthenticationValue();
		}

		@Override
		public void setValue(Authentication obj, Max70Text value) {
			obj.setAuthenticationValue(value);
		}
	};
	protected PINFormatCode pINFormat;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PINFormatCode
	 * PINFormatCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Authentication
	 * Authentication}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PINFormat"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Encrypted personal identification number (PIN) format."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Authentication, PINFormatCode> mmPINFormat = new MMBusinessAttribute<Authentication, PINFormatCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Authentication.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PINFormat";
			definition = "Encrypted personal identification number (PIN) format.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PINFormatCode.mmObject();
		}

		@Override
		public PINFormatCode getValue(Authentication obj) {
			return obj.getPINFormat();
		}

		@Override
		public void setValue(Authentication obj, PINFormatCode value) {
			obj.setPINFormat(value);
		}
	};
	protected Max140Binary pIN;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max140Binary Max140Binary}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Authentication
	 * Authentication}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Personal Identification Number (PIN) for authentication."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Authentication, Max140Binary> mmPIN = new MMBusinessAttribute<Authentication, Max140Binary>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Authentication.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PIN";
			definition = "Personal Identification Number (PIN) for authentication.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max140Binary.mmObject();
		}

		@Override
		public Max140Binary getValue(Authentication obj) {
			return obj.getPIN();
		}

		@Override
		public void setValue(Authentication obj, Max140Binary value) {
			obj.setPIN(value);
		}
	};
	protected Max35Text authenticationSupport;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Authentication
	 * Authentication}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthenticationSupport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "This indicator identifies whether person authentication is supported and data is available."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Authentication, Max35Text> mmAuthenticationSupport = new MMBusinessAttribute<Authentication, Max35Text>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Authentication.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AuthenticationSupport";
			definition = "This indicator identifies whether person authentication is supported and data is available.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(Authentication obj) {
			return obj.getAuthenticationSupport();
		}

		@Override
		public void setValue(Authentication obj, Max35Text value) {
			obj.setAuthenticationSupport(value);
		}
	};
	protected Max35Text collectionIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Authentication
	 * Authentication}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollectionIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies in electronic commerce transactions whether customer authentication is supported and data is available."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Authentication, Max35Text> mmCollectionIndicator = new MMBusinessAttribute<Authentication, Max35Text>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Authentication.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CollectionIndicator";
			definition = "Identifies in electronic commerce transactions whether customer authentication is supported and data is available.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(Authentication obj) {
			return obj.getCollectionIndicator();
		}

		@Override
		public void setValue(Authentication obj, Max35Text value) {
			obj.setCollectionIndicator(value);
		}
	};
	protected Mandate mandate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Mandate#mmAuthentication
	 * Mandate.mmAuthentication}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Mandate Mandate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Authentication
	 * Authentication}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Mandate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the mandate related to the transport authentication details mandate."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<Authentication, Mandate> mmMandate = new MMBusinessAssociationEnd<Authentication, Mandate>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Authentication.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Mandate";
			definition = "Specifies the mandate related to the transport authentication details mandate.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> Mandate.mmAuthentication;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> Mandate.mmObject();
		}

		@Override
		public Mandate getValue(Authentication obj) {
			return obj.getMandate();
		}

		@Override
		public void setValue(Authentication obj, Mandate value) {
			obj.setMandate(value);
		}
	};
	protected AuthenticationResultCode authenticationResult;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AuthenticationResultCode
	 * AuthenticationResultCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.Authentication
	 * Authentication}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthenticationResult"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the result of the authentication."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<Authentication, AuthenticationResultCode> mmAuthenticationResult = new MMBusinessAttribute<Authentication, AuthenticationResultCode>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.Authentication.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AuthenticationResult";
			definition = "Specifies the result of the authentication.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AuthenticationResultCode.mmObject();
		}

		@Override
		public AuthenticationResultCode getValue(Authentication obj) {
			return obj.getAuthenticationResult();
		}

		@Override
		public void setValue(Authentication obj, AuthenticationResultCode value) {
			obj.setAuthenticationResult(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Authentication";
				definition = "Data related to the authentication of the cardholder.";
				associationDomain_lazy = () -> Arrays.asList(CardholderRole.mmAuthentication, Mandate.mmAuthentication);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Authentication.mmCardholder, com.tools20022.repository.entity.Authentication.mmAuthenticationMethod,
						com.tools20022.repository.entity.Authentication.mmAuthenticationEntity, com.tools20022.repository.entity.Authentication.mmAuthenticationValue, com.tools20022.repository.entity.Authentication.mmPINFormat,
						com.tools20022.repository.entity.Authentication.mmPIN, com.tools20022.repository.entity.Authentication.mmAuthenticationSupport, com.tools20022.repository.entity.Authentication.mmCollectionIndicator,
						com.tools20022.repository.entity.Authentication.mmMandate, com.tools20022.repository.entity.Authentication.mmAuthenticationResult);
				derivationComponent_lazy = () -> Arrays.asList(CardholderAuthentication2.mmObject(), MandateAuthentication1.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return Authentication.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<CardholderRole> getCardholder() {
		return cardholder == null ? Optional.empty() : Optional.of(cardholder);
	}

	public Authentication setCardholder(CardholderRole cardholder) {
		this.cardholder = cardholder;
		return this;
	}

	public AuthenticationMethodCode getAuthenticationMethod() {
		return authenticationMethod;
	}

	public Authentication setAuthenticationMethod(AuthenticationMethodCode authenticationMethod) {
		this.authenticationMethod = Objects.requireNonNull(authenticationMethod);
		return this;
	}

	public AuthenticationEntityCode getAuthenticationEntity() {
		return authenticationEntity;
	}

	public Authentication setAuthenticationEntity(AuthenticationEntityCode authenticationEntity) {
		this.authenticationEntity = Objects.requireNonNull(authenticationEntity);
		return this;
	}

	public Max70Text getAuthenticationValue() {
		return authenticationValue;
	}

	public Authentication setAuthenticationValue(Max70Text authenticationValue) {
		this.authenticationValue = Objects.requireNonNull(authenticationValue);
		return this;
	}

	public PINFormatCode getPINFormat() {
		return pINFormat;
	}

	public Authentication setPINFormat(PINFormatCode pINFormat) {
		this.pINFormat = Objects.requireNonNull(pINFormat);
		return this;
	}

	public Max140Binary getPIN() {
		return pIN;
	}

	public Authentication setPIN(Max140Binary pIN) {
		this.pIN = Objects.requireNonNull(pIN);
		return this;
	}

	public Max35Text getAuthenticationSupport() {
		return authenticationSupport;
	}

	public Authentication setAuthenticationSupport(Max35Text authenticationSupport) {
		this.authenticationSupport = Objects.requireNonNull(authenticationSupport);
		return this;
	}

	public Max35Text getCollectionIndicator() {
		return collectionIndicator;
	}

	public Authentication setCollectionIndicator(Max35Text collectionIndicator) {
		this.collectionIndicator = Objects.requireNonNull(collectionIndicator);
		return this;
	}

	public Mandate getMandate() {
		return mandate;
	}

	public Authentication setMandate(Mandate mandate) {
		this.mandate = Objects.requireNonNull(mandate);
		return this;
	}

	public AuthenticationResultCode getAuthenticationResult() {
		return authenticationResult;
	}

	public Authentication setAuthenticationResult(AuthenticationResultCode authenticationResult) {
		this.authenticationResult = Objects.requireNonNull(authenticationResult);
		return this;
	}
}