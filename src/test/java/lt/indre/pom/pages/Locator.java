package lt.indre.pom.pages;

import org.openqa.selenium.By;

public class Locator {

    public static class Varle {

        public static class SetUp {
            public static By buttonCookies = By.xpath(
                    "//button [@id = 'CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll' ]"
            );
            public static By labelPrisijungimas = By.xpath(
                    "//img [@src = '/static/web/img/account-icon.svg']"
            );
            public static By buttonPrisijungti = By.xpath(
                    "//button [@type = 'submit' and @class = 'primary-button full-width login-btn' ]"
            );

            public static By attributeIdPrisijungimas(String attributeId, String attribute2Id) {
                return By.xpath("//input [@type = '%s' and @name = '%s']".formatted(attributeId, attribute2Id));
            }

        }

        public static class Registration {
            public static By buttonRegistracija = By.xpath(
                    "//img [@src = '/static/web/img/account-icon.svg']"
            );
            public static By textRegistruotis = By.xpath("//a [@href = '/profile/register/']");

            public static By inputElPastas = By.xpath("//input[@type = 'email' and @id ='id_email' ]");

            public static By checkboxSusipazinauSuTaisyklemis = By.xpath(
                    "//input [@type ='checkbox' and @name = 'agreement_check']"
            );
            public static By buttonRegistruotis = By.xpath(
                    "//button [@type = 'submit' and @class = 'primary-button full-width login-btn' ] "
            );

            public static By labelManoDuomenys = By.xpath(
                    "//img [@src = '/static/web/img/id-card-icon.svg' ] "
            );
            public static By labelNaikintiPaskyra = By.xpath(
                    "//span [@class = 'delete-account blue-link' ]"
            );
            public static By buttonTaipsubmitDeleteAccount = By.xpath(
                    "//button [@class = 'secondary-button confirm']");

            public static By messageSveikiAccountName = By.xpath("//a [@href = '/profile/' ]");

            public static By labelPrisijungimas = By.xpath(
                    "//img [@src = '/static/web/img/account-icon.svg']"
            );
            public static By buttonPrisijungti = By.xpath(
                    "//button [@type = 'submit' and @class = 'primary-button full-width login-btn' ]"
            );
            public static By textRegistracija = By.xpath(
                    "//span[@class='register']/span[text()='Registracija']"
            );


            public static By attributeIdSlaptazodis(String attributeId) {
                return By.xpath("//input [@type = 'password' and @name = '%s'] ".formatted(attributeId));
            }


            public static By attributeIdPrisijungimas(String attributeId, String attribute2Id) {
                return By.xpath("//input [@type = '%s' and @name = '%s']".formatted(attributeId, attribute2Id));
            }
        }

        public static class Login {
            public static By labelPrisijungimas = By.xpath(
                    "//img [@src = '/static/web/img/account-icon.svg']"
            );

            public static By buttonPrisijungti = By.xpath(
                    "//button [@type = 'submit' and @class = 'primary-button full-width login-btn' ] "
            );

            public static By messageAfterUnsuccessfulLogin = By.xpath(
                    "//div [@class = 'error-message-box' ]"
            );

            public static By attributeIdPrisijungimas(String attributeId, String attribute2Id) {
                return By.xpath("//input [@type = '%s' and @name = '%s']".formatted(attributeId, attribute2Id));
            }

        }


        public static class ShoppingCart {
            public static By inputPaieska = By.xpath("//input [@name = 'q' ]");

            public static By itemDulkiuSiurblysDysonV10 = By.xpath("//div [@class = 'img-container']");

            public static By buttonIKrepseli = By.xpath(
                    "//a [@class = 'primary-button full-width add-to-cart in-stock' ] "
            );
            public static By buttonPrekintisToliau = By.xpath("//button [@class = 'secondary-button' ]");

            public static By buttonPrekiuKrepselis = By.xpath(
                    "//a [@href = '#' and @data-tooltip = 'Krepšelis' and @class = 'disabled' ]"
            );

            public static By itemKavosAparatasDelongiEcam22 = By.xpath(
                    "//div [@class = 'img-container']"
            );
            public static By buttonQuantityUp = By.xpath("//button [@class = 'quantity-up' ]");

            public static By buttonRemoveItemFromKrepselis = By.xpath("//a [@class = 'remove' ]");

            public static By paragraphEmptyShoppingCart = By.xpath(
                    "//a [@href = '#' and @data-tooltip = 'Krepšelis' and @class = 'disabled' ] "
            );

            public static By messageTitleKrepselis = By.xpath("//strong [@class = 'title' ]");

            public static By messageTitleDulkiuSiurblysDysonV10 = By.xpath(
                    "//a[contains(text(), 'Dulkių siurblys Dyson V10 Absolute')]"
            );

        }

        public static class WishList {

            public static By inputInPaieska = By.xpath("//input [@name = 'q' ]");

            public static By itemSoyssSampunasOleoItense = By.xpath(
                    "//div [@class = 'img-container']"
            );
            public static By checkboxSymbolHeart = By.xpath(
                    "//div [@class = 'share-like for-desktop' ]"
            );
            public static By logoVarle = By.xpath("//a [@href = '/' and @class = 'logo']");

            public static By buttonPatikusiosPrekes = By.xpath(
                    "//div [@class =  'header-wishlist-container' ] "
            );

            public static By messagePatikusiosPrekes = By.xpath(
                    "//* [contains(  text(),  'Patikusios prekės ('  )]"
            );
            public static By titleSoyssSampunasOleoIntense = By.xpath(
                    "//a [contains (text(), 'Syoss Šampūnas Oleo Intense, 440ml' )]"
            );

            public static By messageEmptyWishlist = By.xpath("//div [@class = 'no-wishlist' ]");

            public static By labelPasalinti = By.xpath("" +
                    "//button [@type = 'button' and @class = 'delete_wishlist_item-btn']"
            );
        }
    }

}
