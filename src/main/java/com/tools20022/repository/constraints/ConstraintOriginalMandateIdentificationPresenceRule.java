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
import com.tools20022.repository.msg.MandateAcceptance5;

/**
 * When AcceptanceResults/Accepted is "true" then
 * OriginalMandate/OriginalMandateIdentification must be present or
 * OriginalMandate/OriginalMandate/OriginalMandateIdentification must be
 * present.
 */
public class ConstraintOriginalMandateIdentificationPresenceRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.MandateAcceptance5
	 * MandateAcceptance5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getExpression
	 * expression} =
	 * "&lt;RuleDefinition&gt;&lt;ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"&gt;&lt;mustBe&gt;&lt;connector&gt;OR&lt;/connector&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OriginalMandate/OriginalMandateIdentification&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;BooleanRule xsi:type=\"Presence\"&gt;&lt;leftOperand&gt;/OriginalMandate/OriginalMandate/MandateIdentification&lt;/leftOperand&gt;&lt;/BooleanRule&gt;&lt;/mustBe&gt;&lt;onCondition&gt;&lt;connector&gt;AND&lt;/connector&gt;&lt;BooleanRule xsi:type=\"DifferentFromValue\"&gt;&lt;leftOperand&gt;/AcceptanceResult/Accepted&lt;/leftOperand&gt;&lt;rightOperand&gt;true&lt;/rightOperand&gt;&lt;/BooleanRule&gt;&lt;/onCondition&gt;&lt;/ComplexRule&gt;&lt;/RuleDefinition&gt;"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalMandateIdentificationPresenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "When AcceptanceResults/Accepted is \"true\" then OriginalMandate/OriginalMandateIdentification must be present or OriginalMandate/OriginalMandate/OriginalMandateIdentification must be present."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<MandateAcceptance5> forMandateAcceptance5 = new MMConstraint<MandateAcceptance5>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalMandateIdentificationPresenceRule";
			definition = "When AcceptanceResults/Accepted is \"true\" then OriginalMandate/OriginalMandateIdentification must be present or OriginalMandate/OriginalMandate/OriginalMandateIdentification must be present.";
			owner_lazy = () -> MandateAcceptance5.mmObject();
			expression = "<RuleDefinition><ComplexRule xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:type=\"ComplexRule\"><mustBe><connector>OR</connector><BooleanRule xsi:type=\"Presence\"><leftOperand>/OriginalMandate/OriginalMandateIdentification</leftOperand></BooleanRule><BooleanRule xsi:type=\"Presence\"><leftOperand>/OriginalMandate/OriginalMandate/MandateIdentification</leftOperand></BooleanRule></mustBe><onCondition><connector>AND</connector><BooleanRule xsi:type=\"DifferentFromValue\"><leftOperand>/AcceptanceResult/Accepted</leftOperand><rightOperand>true</rightOperand></BooleanRule></onCondition></ComplexRule></RuleDefinition>";
		}

		@Override
		public void executeValidator(MandateAcceptance5 obj) throws Exception {
			checkMandateAcceptance5(obj);
		}
	};

	/**
	 * When AcceptanceResults/Accepted is "true" then
	 * OriginalMandate/OriginalMandateIdentification must be present or
	 * OriginalMandate/OriginalMandate/OriginalMandateIdentification must be
	 * present.
	 */
	public static void checkMandateAcceptance5(MandateAcceptance5 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}