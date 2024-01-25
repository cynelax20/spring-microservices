package com.eazybytes.cards.service;

import com.eazybytes.cards.dto.CardsDto;

public interface ICardsService {
    /**
     *
     * @param mobileNumber
     */
    void createCard(String mobileNumber);

    /**
     *
     * @param mobileNumber
     * @return CardsDto
     */
    CardsDto fetchCard(String mobileNumber);

    /**
     *
     * @param cardsDto
     * @return boolean
     */
    boolean updateCard(CardsDto cardsDto);

    /**
     *
     * @param mobileNumber - input mobile number
     * @return boolean indicating if the delete of the card details is successful or not
     */
    boolean deleteCard(String mobileNumber);
}
