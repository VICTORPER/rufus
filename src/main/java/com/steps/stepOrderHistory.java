package com.steps;

import com.pages.orderHistoryPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class stepOrderHistory {
    @Steps
    orderHistoryPage orderHistory;

    @Step
    public void btnOrderHistory()
    {
        orderHistory.btnOrderHistory();
    }
    @Step
    public boolean isDisplayed(){
        return orderHistory.OrderSucces();
    }

}
