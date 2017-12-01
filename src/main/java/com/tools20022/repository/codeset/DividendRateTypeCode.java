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

package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the type of dividend rate.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DividendRateTypeCode#mmCapitalPortion
 * DividendRateTypeCode.mmCapitalPortion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DividendRateTypeCode#mmFullyFranked
 * DividendRateTypeCode.mmFullyFranked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DividendRateTypeCode#mmIncomePortion
 * DividendRateTypeCode.mmIncomePortion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DividendRateTypeCode#mmInterest
 * DividendRateTypeCode.mmInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DividendRateTypeCode#mmSundryOrOtherIncome
 * DividendRateTypeCode.mmSundryOrOtherIncome}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DividendRateTypeCode#mmTaxablePortion
 * DividendRateTypeCode.mmTaxablePortion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DividendRateTypeCode#mmTaxDeferred
 * DividendRateTypeCode.mmTaxDeferred}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DividendRateTypeCode#mmTaxFree
 * DividendRateTypeCode.mmTaxFree}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DividendRateTypeCode#mmUnfranked
 * DividendRateTypeCode.mmUnfranked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DividendRateTypeCode#mmLongTermCapitalGain
 * DividendRateTypeCode.mmLongTermCapitalGain}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DividendRateTypeCode#mmShortTermCapitalGain
 * DividendRateTypeCode.mmShortTermCapitalGain}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DividendRateTypeCode#mmFullPeriodUnitsIncomePortion
 * DividendRateTypeCode.mmFullPeriodUnitsIncomePortion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DividendRateTypeCode#mmPartWayPeriodUnitsIncomePortion
 * DividendRateTypeCode.mmPartWayPeriodUnitsIncomePortion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DividendRateTypeCode#mmRealEstatePropertyIncomePortion
 * DividendRateTypeCode.mmRealEstatePropertyIncomePortion}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"CAPO"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DividendRateTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of dividend rate."</li>
 * </ul>
 */
public class DividendRateTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Rate relating to the underlying security for which capital is
	 * distributed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DividendRateTypeCode
	 * DividendRateTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CAPO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CapitalPortion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rate relating to the underlying security for which capital is distributed."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCapitalPortion = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CapitalPortion";
			definition = "Rate relating to the underlying security for which capital is distributed.";
			owner_lazy = () -> DividendRateTypeCode.mmObject();
			codeName = "CAPO";
		}
	};
	/**
	 * Rate resulting from a fully franked dividend paid by a company; rate
	 * includes tax credit for companies that have made sufficient tax payments
	 * during fiscal period.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DividendRateTypeCode
	 * DividendRateTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FLFR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FullyFranked"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rate resulting from a fully franked dividend paid by a company; rate includes tax credit for companies that have made sufficient tax payments during fiscal period."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmFullyFranked = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FullyFranked";
			definition = "Rate resulting from a fully franked dividend paid by a company; rate includes tax credit for companies that have made sufficient tax payments during fiscal period.";
			owner_lazy = () -> DividendRateTypeCode.mmObject();
			codeName = "FLFR";
		}
	};
	/**
	 * Rate relating to the underlying security for which income is distributed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DividendRateTypeCode
	 * DividendRateTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INCO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncomePortion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rate relating to the underlying security for which income is distributed."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmIncomePortion = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IncomePortion";
			definition = "Rate relating to the underlying security for which income is distributed.";
			owner_lazy = () -> DividendRateTypeCode.mmObject();
			codeName = "INCO";
		}
	};
	/**
	 * Rate relating to the underlying security for which interest is paid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DividendRateTypeCode
	 * DividendRateTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INTR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Interest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rate relating to the underlying security for which interest is paid."</li>
	 * </ul>
	 */
	public static final MMCode mmInterest = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Interest";
			definition = "Rate relating to the underlying security for which interest is paid.";
			owner_lazy = () -> DividendRateTypeCode.mmObject();
			codeName = "INTR";
		}
	};
	/**
	 * Rate relating to the underlying security for which other income is paid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DividendRateTypeCode
	 * DividendRateTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SOIC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SundryOrOtherIncome"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rate relating to the underlying security for which other income is paid."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmSundryOrOtherIncome = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SundryOrOtherIncome";
			definition = "Rate relating to the underlying security for which other income is paid.";
			owner_lazy = () -> DividendRateTypeCode.mmObject();
			codeName = "SOIC";
		}
	};
	/**
	 * Rate relating to the underlying security for which tax is charged.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DividendRateTypeCode
	 * DividendRateTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TXBL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxablePortion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rate relating to the underlying security for which tax is charged."</li>
	 * </ul>
	 */
	public static final MMCode mmTaxablePortion = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxablePortion";
			definition = "Rate relating to the underlying security for which tax is charged.";
			owner_lazy = () -> DividendRateTypeCode.mmObject();
			codeName = "TXBL";
		}
	};
	/**
	 * Rate relating to the underlying security for which tax is deferred.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DividendRateTypeCode
	 * DividendRateTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TXDF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxDeferred"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rate relating to the underlying security for which tax is deferred."</li>
	 * </ul>
	 */
	public static final MMCode mmTaxDeferred = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxDeferred";
			definition = "Rate relating to the underlying security for which tax is deferred.";
			owner_lazy = () -> DividendRateTypeCode.mmObject();
			codeName = "TXDF";
		}
	};
	/**
	 * Rate relating to the underlying security which is not taxable
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DividendRateTypeCode
	 * DividendRateTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TXFR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxFree"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rate relating to the underlying security which is not taxable"</li>
	 * </ul>
	 */
	public static final MMCode mmTaxFree = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxFree";
			definition = "Rate relating to the underlying security which is not taxable";
			owner_lazy = () -> DividendRateTypeCode.mmObject();
			codeName = "TXFR";
		}
	};
	/**
	 * Rate resulting from an unfranked dividend paid by a company; the rate
	 * doesnt include tax credit and is subject to withholding tax.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DividendRateTypeCode
	 * DividendRateTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UNFR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unfranked"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rate resulting from an unfranked dividend paid by a company; the rate\ndoesnt include tax credit and is subject to withholding tax."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmUnfranked = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Unfranked";
			definition = "Rate resulting from an unfranked dividend paid by a company; the rate\ndoesnt include tax credit and is subject to withholding tax.";
			owner_lazy = () -> DividendRateTypeCode.mmObject();
			codeName = "UNFR";
		}
	};
	/**
	 * Long term capital gain.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DividendRateTypeCode
	 * DividendRateTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LTCG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LongTermCapitalGain"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Long term capital gain."</li>
	 * </ul>
	 */
	public static final MMCode mmLongTermCapitalGain = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LongTermCapitalGain";
			definition = "Long term capital gain.";
			owner_lazy = () -> DividendRateTypeCode.mmObject();
			codeName = "LTCG";
		}
	};
	/**
	 * Short term capital gain.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DividendRateTypeCode
	 * DividendRateTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "STCG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShortTermCapitalGain"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Short term capital gain."</li>
	 * </ul>
	 */
	public static final MMCode mmShortTermCapitalGain = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ShortTermCapitalGain";
			definition = "Short term capital gain.";
			owner_lazy = () -> DividendRateTypeCode.mmObject();
			codeName = "STCG";
		}
	};
	/**
	 * Distribution rate relating to the full period units, for example Group I
	 * units in UK.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DividendRateTypeCode
	 * DividendRateTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FUPU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FullPeriodUnitsIncomePortion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Distribution rate relating to the full period units, for example Group I units in UK. "
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmFullPeriodUnitsIncomePortion = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FullPeriodUnitsIncomePortion";
			definition = "Distribution rate relating to the full period units, for example Group I units in UK. ";
			owner_lazy = () -> DividendRateTypeCode.mmObject();
			codeName = "FUPU";
		}
	};
	/**
	 * Distribution rate relating to the part way period units, for example
	 * Group II units in UK.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DividendRateTypeCode
	 * DividendRateTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PAPU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartWayPeriodUnitsIncomePortion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Distribution rate relating to the part way period units, for example Group II units in UK. "
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmPartWayPeriodUnitsIncomePortion = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartWayPeriodUnitsIncomePortion";
			definition = "Distribution rate relating to the part way period units, for example Group II units in UK. ";
			owner_lazy = () -> DividendRateTypeCode.mmObject();
			codeName = "PAPU";
		}
	};
	/**
	 * Rate of income distribution originated by real estate investment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DividendRateTypeCode
	 * DividendRateTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REES"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RealEstatePropertyIncomePortion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rate of income distribution originated by real estate investment."</li>
	 * </ul>
	 */
	public static final MMCode mmRealEstatePropertyIncomePortion = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RealEstatePropertyIncomePortion";
			definition = "Rate of income distribution originated by real estate investment.";
			owner_lazy = () -> DividendRateTypeCode.mmObject();
			codeName = "REES";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("CAPO");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DividendRateTypeCode";
				definition = "Specifies the type of dividend rate.";
				code_lazy = () -> Arrays.asList(DividendRateTypeCode.mmCapitalPortion, DividendRateTypeCode.mmFullyFranked, DividendRateTypeCode.mmIncomePortion, DividendRateTypeCode.mmInterest, DividendRateTypeCode.mmSundryOrOtherIncome,
						DividendRateTypeCode.mmTaxablePortion, DividendRateTypeCode.mmTaxDeferred, DividendRateTypeCode.mmTaxFree, DividendRateTypeCode.mmUnfranked, DividendRateTypeCode.mmLongTermCapitalGain,
						DividendRateTypeCode.mmShortTermCapitalGain, DividendRateTypeCode.mmFullPeriodUnitsIncomePortion, DividendRateTypeCode.mmPartWayPeriodUnitsIncomePortion, DividendRateTypeCode.mmRealEstatePropertyIncomePortion);
			}
		});
		return mmObject_lazy.get();
	}
}