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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.CommercialTrade;
import com.tools20022.repository.entity.Contract;
import com.tools20022.repository.entity.Loan;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.LoanContract1;
import com.tools20022.repository.msg.TradeContract1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice of the type of underlying contract.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.UnderlyingContract1Choice#mmLoan
 * UnderlyingContract1Choice.mmLoan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.UnderlyingContract1Choice#mmTrade
 * UnderlyingContract1Choice.mmTrade}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Contract Contract}</li>
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
 * "UnderlyingContract1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice of the type of underlying contract."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "UnderlyingContract1Choice", propOrder = {"loan", "trade"})
public class UnderlyingContract1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Ln", required = true)
	protected LoanContract1 loan;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.LoanContract1
	 * LoanContract1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Loan Loan}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.UnderlyingContract1Choice
	 * UnderlyingContract1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ln"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Loan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Underlying registered contract is a loan."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<UnderlyingContract1Choice, LoanContract1> mmLoan = new MMMessageAssociationEnd<UnderlyingContract1Choice, LoanContract1>() {
		{
			businessComponentTrace_lazy = () -> Loan.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.UnderlyingContract1Choice.mmObject();
			isDerived = false;
			xmlTag = "Ln";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Loan";
			definition = "Underlying registered contract is a loan.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> LoanContract1.mmObject();
		}

		@Override
		public LoanContract1 getValue(UnderlyingContract1Choice obj) {
			return obj.getLoan();
		}

		@Override
		public void setValue(UnderlyingContract1Choice obj, LoanContract1 value) {
			obj.setLoan(value);
		}
	};
	@XmlElement(name = "Trad", required = true)
	protected TradeContract1 trade;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TradeContract1
	 * TradeContract1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CommercialTrade
	 * CommercialTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.UnderlyingContract1Choice
	 * UnderlyingContract1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Trad"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Trade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Underlying registered contract is a commercial trade."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<UnderlyingContract1Choice, TradeContract1> mmTrade = new MMMessageAssociationEnd<UnderlyingContract1Choice, TradeContract1>() {
		{
			businessComponentTrace_lazy = () -> CommercialTrade.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.UnderlyingContract1Choice.mmObject();
			isDerived = false;
			xmlTag = "Trad";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Trade";
			definition = "Underlying registered contract is a commercial trade.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> TradeContract1.mmObject();
		}

		@Override
		public TradeContract1 getValue(UnderlyingContract1Choice obj) {
			return obj.getTrade();
		}

		@Override
		public void setValue(UnderlyingContract1Choice obj, TradeContract1 value) {
			obj.setTrade(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.UnderlyingContract1Choice.mmLoan, com.tools20022.repository.choice.UnderlyingContract1Choice.mmTrade);
				trace_lazy = () -> Contract.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "UnderlyingContract1Choice";
				definition = "Choice of the type of underlying contract.";
			}
		});
		return mmObject_lazy.get();
	}

	public LoanContract1 getLoan() {
		return loan;
	}

	public UnderlyingContract1Choice setLoan(LoanContract1 loan) {
		this.loan = Objects.requireNonNull(loan);
		return this;
	}

	public TradeContract1 getTrade() {
		return trade;
	}

	public UnderlyingContract1Choice setTrade(TradeContract1 trade) {
		this.trade = Objects.requireNonNull(trade);
		return this;
	}
}