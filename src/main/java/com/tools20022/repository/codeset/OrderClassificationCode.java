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
 * Identifies the classification and thus the restrictions associated with an
 * order (for regulatory purposes).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderClassificationCode#mmProgramTrade
 * OrderClassificationCode.mmProgramTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderClassificationCode#mmIndexArbitrage
 * OrderClassificationCode.mmIndexArbitrage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderClassificationCode#mmNonIndexArbitrage
 * OrderClassificationCode.mmNonIndexArbitrage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderClassificationCode#mmCompetingMarketMaker
 * OrderClassificationCode.mmCompetingMarketMaker}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderClassificationCode#mmSpecialistInSecurity
 * OrderClassificationCode.mmSpecialistInSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderClassificationCode#mmSpecialistInUnderlyingSecurity
 * OrderClassificationCode.mmSpecialistInUnderlyingSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderClassificationCode#mmForeignEntity
 * OrderClassificationCode.mmForeignEntity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderClassificationCode#mmExternalMarketParticipant
 * OrderClassificationCode.mmExternalMarketParticipant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderClassificationCode#mmExternalInterConnectedMarketLinkage
 * OrderClassificationCode.mmExternalInterConnectedMarketLinkage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderClassificationCode#mmRisklessArbitrage
 * OrderClassificationCode.mmRisklessArbitrage}</li>
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
 * <li>"PROG"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "OrderClassificationCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Identifies the classification and thus the restrictions associated with an order (for regulatory purposes)."
 * </li>
 * </ul>
 */
public class OrderClassificationCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Purchase or sale of a large number of stocks. Originally called program
	 * trading when index funds and other institutional investors began to
	 * embark on large-scale buying and selling campaigns or programs to
	 * replicate a target stock index. The term includes computer aided stock
	 * market buying or selling programs, portfolio insurance and index
	 * arbitrage.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderClassificationCode
	 * OrderClassificationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PROG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProgramTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Purchase or sale of a large number of stocks. Originally called program trading when index funds and other institutional\ninvestors began to embark on large-scale buying and selling campaigns or programs to replicate a target stock index. The\nterm includes computer aided stock market buying or selling programs, portfolio insurance and index arbitrage."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmProgramTrade = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProgramTrade";
			definition = "Purchase or sale of a large number of stocks. Originally called program trading when index funds and other institutional\ninvestors began to embark on large-scale buying and selling campaigns or programs to replicate a target stock index. The\nterm includes computer aided stock market buying or selling programs, portfolio insurance and index arbitrage.";
			owner_lazy = () -> OrderClassificationCode.mmObject();
			codeName = "PROG";
		}
	};
	/**
	 * Program trade on a stock index. Simultaneous purchase and sale of an
	 * index future and the index underlying securities to profit from
	 * intermarket spreads between the future and the index itself.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderClassificationCode
	 * OrderClassificationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ARBT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndexArbitrage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Program trade on a stock index. Simultaneous purchase and sale of an index future and the index underlying securities to\nprofit from intermarket spreads between the future and the index itself."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmIndexArbitrage = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndexArbitrage";
			definition = "Program trade on a stock index. Simultaneous purchase and sale of an index future and the index underlying securities to\nprofit from intermarket spreads between the future and the index itself.";
			owner_lazy = () -> OrderClassificationCode.mmObject();
			codeName = "ARBT";
		}
	};
	/**
	 * Simultaneous purchase and sale of a large number of securities to profit
	 * from intermarket spreads between financial instruments that do not
	 * include stock indexes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderClassificationCode
	 * OrderClassificationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NARB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonIndexArbitrage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Simultaneous purchase and sale of a large number of securities to profit from intermarket spreads between financial\ninstruments that do not include stock indexes."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmNonIndexArbitrage = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonIndexArbitrage";
			definition = "Simultaneous purchase and sale of a large number of securities to profit from intermarket spreads between financial\ninstruments that do not include stock indexes.";
			owner_lazy = () -> OrderClassificationCode.mmObject();
			codeName = "NARB";
		}
	};
	/**
	 * Specialist or market maker registered as such on a registered stock
	 * exchange, or a market maker bidding and offering over-the-counter.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderClassificationCode
	 * OrderClassificationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CMAR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CompetingMarketMaker"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specialist or market maker registered as such on a registered stock exchange, or a market maker bidding and offering over-the-counter."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCompetingMarketMaker = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CompetingMarketMaker";
			definition = "Specialist or market maker registered as such on a registered stock exchange, or a market maker bidding and offering over-the-counter.";
			owner_lazy = () -> OrderClassificationCode.mmObject();
			codeName = "CMAR";
		}
	};
	/**
	 * Specialist or market maker registered as such on a registered stock
	 * exchange, or a market maker acting based on a set of rules applicable to
	 * a defined security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderClassificationCode
	 * OrderClassificationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SSPE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecialistInSecurity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specialist or market maker registered as such on a registered stock exchange, or a market maker acting based on a set of\nrules applicable to a defined security."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmSpecialistInSecurity = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecialistInSecurity";
			definition = "Specialist or market maker registered as such on a registered stock exchange, or a market maker acting based on a set of\nrules applicable to a defined security.";
			owner_lazy = () -> OrderClassificationCode.mmObject();
			codeName = "SSPE";
		}
	};
	/**
	 * Specialist or market maker registered as such on a registered stock
	 * exchange, or a market maker acting based on a set of rules applicable to
	 * a defined underlying security of a derivative product.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderClassificationCode
	 * OrderClassificationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "USPE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecialistInUnderlyingSecurity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specialist or market maker registered as such on a registered stock exchange, or a market maker acting based on a set of\nrules applicable to a defined underlying security of a derivative product."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmSpecialistInUnderlyingSecurity = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecialistInUnderlyingSecurity";
			definition = "Specialist or market maker registered as such on a registered stock exchange, or a market maker acting based on a set of\nrules applicable to a defined underlying security of a derivative product.";
			owner_lazy = () -> OrderClassificationCode.mmObject();
			codeName = "USPE";
		}
	};
	/**
	 * Non domestic business entity, foreign government or regulatory
	 * jurisdiction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderClassificationCode
	 * OrderClassificationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FORE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignEntity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Non domestic business entity, foreign government or regulatory jurisdiction."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmForeignEntity = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignEntity";
			definition = "Non domestic business entity, foreign government or regulatory jurisdiction.";
			owner_lazy = () -> OrderClassificationCode.mmObject();
			codeName = "FORE";
		}
	};
	/**
	 * Participating entity not registered on an exchange.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderClassificationCode
	 * OrderClassificationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EXMA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExternalMarketParticipant"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Participating entity not registered on an exchange."</li>
	 * </ul>
	 */
	public static final MMCode mmExternalMarketParticipant = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExternalMarketParticipant";
			definition = "Participating entity not registered on an exchange.";
			owner_lazy = () -> OrderClassificationCode.mmObject();
			codeName = "EXMA";
		}
	};
	/**
	 * Participating entity linked but not registered on an exchange.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderClassificationCode
	 * OrderClassificationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MALI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExternalInterConnectedMarketLinkage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Participating entity linked but not registered on an exchange."</li>
	 * </ul>
	 */
	public static final MMCode mmExternalInterConnectedMarketLinkage = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExternalInterConnectedMarketLinkage";
			definition = "Participating entity linked but not registered on an exchange.";
			owner_lazy = () -> OrderClassificationCode.mmObject();
			codeName = "MALI";
		}
	};
	/**
	 * Risk-free transaction consisting of purchasing an asset at one price and
	 * simultaneously selling that same asset at a higher price, generating a
	 * profit on the difference.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderClassificationCode
	 * OrderClassificationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RARB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RisklessArbitrage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Risk-free transaction consisting of purchasing an asset at one price and simultaneously selling that same asset at a higher\nprice, generating a profit on the difference."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmRisklessArbitrage = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RisklessArbitrage";
			definition = "Risk-free transaction consisting of purchasing an asset at one price and simultaneously selling that same asset at a higher\nprice, generating a profit on the difference.";
			owner_lazy = () -> OrderClassificationCode.mmObject();
			codeName = "RARB";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("PROG");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OrderClassificationCode";
				definition = "Identifies the classification and thus the restrictions associated with an order (for regulatory purposes).";
				code_lazy = () -> Arrays.asList(OrderClassificationCode.mmProgramTrade, OrderClassificationCode.mmIndexArbitrage, OrderClassificationCode.mmNonIndexArbitrage, OrderClassificationCode.mmCompetingMarketMaker,
						OrderClassificationCode.mmSpecialistInSecurity, OrderClassificationCode.mmSpecialistInUnderlyingSecurity, OrderClassificationCode.mmForeignEntity, OrderClassificationCode.mmExternalMarketParticipant,
						OrderClassificationCode.mmExternalInterConnectedMarketLinkage, OrderClassificationCode.mmRisklessArbitrage);
			}
		});
		return mmObject_lazy.get();
	}
}