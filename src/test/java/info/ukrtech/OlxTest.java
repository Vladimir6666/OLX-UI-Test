package info.ukrtech;

import org.junit.Before;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class OlxTest {
                     //Открываем сайт
        @Before
        public void before(){
                open("https://www.olx.ua");
        }
        @Test
   public void testCreateTest(){

                     //Авторизация
        $("#topLoginLink > span > strong").click();
        $("#userEmail").setValue("vladimir.kostenko1989@gmail.com");
        $("#userPass").setValue("itachik656");
        $("#se_userLogin").click();

                     //Добавляем объявление и заполняем все поля формы
        $("#listContainer > div > div > div > a > span").click();
        $("#add-title").setValue("Продам рубашку").click();
        $("#targetrenderSelect1-0 > dt > a").click();
        $("#cat-891 > span.caticon.cat-icon-891").click();
        $("#category-891 > div.inner.rel > div.viewport > div > ul > li:nth-child(1) > a > span.inlblk").click();
        $("#category-50 > div.inner.rel > div.viewport > div > ul > li:nth-child(5) > a > span.inlblk").click();
        $("#add-title").setValue("Продам рубашку").click();
        $("#parameter-div-price > div.area.clr > div > div.fleft.rel.dynamic-param.x-normal.light.br3 > p:nth-child(3) > input").setValue("100").click();
        $("#targetparam13 > dt > a").click();
        $("#targetparam13 > dd > ul > li:nth-child(2) > a").click();
        $("#param79").setValue("40");
        $("#targetid_private_business > dt > a").click();
        $("#targetid_private_business > dd > ul > li:nth-child(2) > a").click();
        $("#add-description").setValue("Состояние отличное, была куплена в Англии");

                     //Сохраняем объявление
        $("#save").click();

                     //Отменяем платные услуги
        $("#payment_back").click();

                     //Переходим в профиль пользователя
        $("#topLoginLink > span > strong").click();
        $("#topLoginLink > span > strong").click();

                     //Удаляем объявление
        $("#typewaiting > a").click();
        $("#adsTable > tbody > tr.tr.row-stats.lheight16.x-small > td > table > tbody > tr > td:nth-child(3) > table > tbody > tr > td > div > a > span > span").click();
        $("#typearchive > a").click();
        $("#adsTable > tbody > tr.tr.row-elem > td:nth-child(4) > div > div > a.tdnone.marginright5.nowrap.remove-link.globalAction.removeme > span > span").click();


    }
}
