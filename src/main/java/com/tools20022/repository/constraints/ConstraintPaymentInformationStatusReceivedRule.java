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

package com.tools20022.repository.constraints;

import com.tools20022.core.repo.NotImplementedConstraintException;
import com.tools20022.metamodel.MMConstraint;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.msg.OriginalPaymentInstruction23;
import com.tools20022.repository.msg.OriginalPaymentInstruction24;

/**
 * If OriginalPaymentInformationAndStatus/PaymentInformationStatus is present
 * and is equal to RCVD (Received), then
 * TransactionInformationAndStatus/TransactionStatus is not allowed.
 */
public class ConstraintPaymentInformationStatusReceivedRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction23
	 * OriginalPaymentInstruction23}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"&gt;&lt;ComplexRule xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/TransactionInformationAndStatus[*]/TransactionStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/PaymentInformationStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/PaymentInformationStatus&lt;/leftOperand&gt;&lt;rightOperand&gt;Received&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/TransactionInformationAndStatus[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentInformationStatusReceivedRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If OriginalPaymentInformationAndStatus/PaymentInformationStatus is present and is equal to RCVD (Received), then TransactionInformationAndStatus/TransactionStatus is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint forOriginalPaymentInstruction23 = new MMConstraint() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentInformationStatusReceivedRule";
			definition = "If OriginalPaymentInformationAndStatus/PaymentInformationStatus is present and is equal to RCVD (Received), then TransactionInformationAndStatus/TransactionStatus is not allowed.";
			owner_lazy = () -> OriginalPaymentInstruction23.mmObject();
			expression = "<RuleDefinition xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"><ComplexRule xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/TransactionInformationAndStatus[*]/TransactionStatus</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/PaymentInformationStatus</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/PaymentInformationStatus</leftOperand><rightOperand>Received</rightOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/TransactionInformationAndStatus[1]</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>\n";
		}

		@Override
		public void executeValidator(Object obj) throws Exception {
			checkOriginalPaymentInstruction23((OriginalPaymentInstruction23) obj);
		}
	};
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.OriginalPaymentInstruction24
	 * OriginalPaymentInstruction24}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Absence\"&gt;&lt;leftOperand&gt;/TransactionInformationAndStatus[*]/TransactionStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/PaymentInformationStatus&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"EqualToValue\"&gt;&lt;leftOperand&gt;/PaymentInformationStatus&lt;/leftOperand&gt;&lt;rightOperand&gt;Received&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/TransactionInformationAndStatus[1]&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentInformationStatusReceivedRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If PaymentInformationStatus is present and is equal to RCVD, then TransactionInformationAndStatus/TransactionStatus is not allowed."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint forOriginalPaymentInstruction24 = new MMConstraint() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentInformationStatusReceivedRule";
			definition = "If PaymentInformationStatus is present and is equal to RCVD, then TransactionInformationAndStatus/TransactionStatus is not allowed.";
			owner_lazy = () -> OriginalPaymentInstruction24.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>AND</connector><BooleanRule xsi:type=\"Absence\"><leftOperand>/TransactionInformationAndStatus[*]/TransactionStatus</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/PaymentInformationStatus</leftOperand></BooleanRule><BooleanRule xsi:type=\"EqualToValue\"><leftOperand>/PaymentInformationStatus</leftOperand><rightOperand>Received</rightOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/TransactionInformationAndStatus[1]</leftOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(Object obj) throws Exception {
			checkOriginalPaymentInstruction24((OriginalPaymentInstruction24) obj);
		}
	};

	/**
	 * If OriginalPaymentInformationAndStatus/PaymentInformationStatus is
	 * present and is equal to RCVD (Received), then
	 * TransactionInformationAndStatus/TransactionStatus is not allowed.
	 */
	public static void checkOriginalPaymentInstruction23(OriginalPaymentInstruction23 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}

	/**
	 * If PaymentInformationStatus is present and is equal to RCVD, then
	 * TransactionInformationAndStatus/TransactionStatus is not allowed.
	 */
	public static void checkOriginalPaymentInstruction24(OriginalPaymentInstruction24 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}