package lt.indre.pom.pages;

import org.openqa.selenium.By;

public class Locator {
    public static class Varle {

        public static class VarleLtWebsite {
            public static By buttonPrisijungimas = By.xpath(
                    "//img [@src = '/static/web/img/account-icon.svg']"
            );
            public static By textRegistruotis = By.xpath("//a [@href = '/profile/register/']");
            public static By inputElPastas = By.xpath("//input[@type = 'email' and @id ='id_email' ]");
            public static By buttonSusiipazinauSuTaisyklemis = By.xpath(
                    "//input [@type ='checkbox' and @name = 'agreement_check']"
            );
            public static By buttonRegistruotis = By.xpath(
                    "//button [@type = 'submit' and @class = 'primary-button full-width login-btn' ] "
            );
            public static By myAccount = By.xpath("//span [@class  = 'register' ]");
            public static By buttonManoDuomenys = By.xpath(
                    "//img [@src = '/static/web/img/id-card-icon.svg' ] "
            );
            public static By buttonNaikintiPaskyra = By.xpath(
                    "//span [@class = 'delete-account blue-link' ]"
            );
            public static By buttonTaipsubmitDeleteAccount = By.xpath(
                    "//button [@class = 'secondary-button confirm']");
            public static By paragraphtoSubmitToDeleteAccount = By.xpath(
                    "//div [@class = 'delete-account-trigger' ]"
            );

            public static By buttonPrisijungti = By.xpath(
                    "//button [@type = 'submit' and @class = 'primary-button full-width login-btn' ] "
            );
            public static By messageAfterUnsuccessfulLogin = By.xpath(
                    "//div [@class = 'error-message-box' ]"
            );

            public static By inputPaieska = By.xpath("//input [@name = 'q' ]");
            public static By requiredFirstItemTitle = By.xpath(
                    "//div [@class = 'img-container']"
            );
            public static By buttonIKrepseli = By.xpath(
                    "//a [@class = 'primary-button full-width add-to-cart in-stock' ] "
            );
            public static By paragraphPrekeItraukaIKrepseli = By.xpath("//div [@class = 'popup-title' ]");
            public static By buttonPrekintisToliau = By.xpath("//button [@class = 'secondary-button' ]");
            public static By buttonPrekiuKrepselis = By.xpath("//span [@class = 'cart-items' ]");

            public static By kavosaparatas = By.xpath("//div [@class = 'img-container']");
            public static By buttonQuantityUp = By.xpath("//button [@class = 'quantity-up' ]");
            public static By buttonRemoveItemFromKrepselis = By.xpath("//a [@class = 'remove' ]");
            public static By paragraphEmptyBasket = By.xpath("//div [@class = 'shopping-container' ]");

            public static By attributeIdPrisijungimas(String attributeId, String attribute2Id) {
                return By.xpath("//input [@type = '%s' and @name = '%s']".formatted(attributeId, attribute2Id));
            }

            public static By attributeIdSlaptazodis(String attributeId) {
                return By.xpath("//input [@type = 'password' and @name = '%s'] ".formatted(attributeId));
            }


        }
    }
}
