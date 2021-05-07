import com.opencart.navigation.Navigation;
import com.opencart.steps.HeaderPageBL;
import com.opencart.steps.LoginPageBL;
import com.opencart.steps.MainPageBL;
import com.opencart.steps.WishListPageBL;
import org.testng.annotations.Test;

import static com.opencart.enums.URLs.BASE_URL;

public class WishListTest extends BaseTest {

    @Test
    public void LoginPerson() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        LoginPageBL loginPageBL = mainPageBL.getHeaderPageBL()
                .clickOnMyAccountButton()
                .clickOnLoginButton()
                .loginPerson();


    }


    @Test
    public void checkWishlist() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        WishListPageBL wishListPageBL = mainPageBL.getNavigationBarPageBL()
                .addProductsToTheWishList()
                .clickOnWishListButton()
                .removeAndAddToCart()
                .clickOnShoppingCartButton();
    }

}

