package tw.edu.kuas.mis.s1101137209;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FirstController {
	@RequestMapping("/helloWorld/{userName}/{year}/{month}/{day}")
    public String helloWorld(Model model
    		,@PathVariable("userName") String name
    		,@PathVariable("year") String year
    		,@PathVariable("month") String month
    		,@PathVariable("day") String day
    		){
        
		model.addAttribute("message", "Hello World!");
		
        model.addAttribute("userName", name);
        model.addAttribute("year", year);
        model.addAttribute("month", month);
        model.addAttribute("day", day);
        String Constellation = null;
        String Zodiac = null;
        String deastintroduce = null;
        String Conste = null;
        int d = Integer.valueOf(day);
        int m = Integer.valueOf(month);
        int y = Integer.valueOf(year);
        String deast;
        
        switch(y%12){
        case 1:
        deast="雞";
        System.out.println(deast);
        Conste="cc.jpg";
        deastintroduce="金雞報曉，處處生機，人人朝氣蓬勃煥然一新，在古代民間祭祀，雞是必備的祭品，雖然犧牲了生命，得到的代價卻不及牛、羊、豬。從前大夫相約誓盟，需用雞血來「歃血為盟」，雞骨可以用來占卜，今日選風鼎盛，動輒砍雞頭發誓自己的無辜，可見雞是古今皆宜的吉祥物。";
        break;
        case 2:
        deast="狗";
        System.out.println(deast);
        Conste="dd.jpg";
        deastintroduce="自從人類以狩獵為生開始，狗就是人類最親近最忠實的朋友，也是最要好的生活伙伴，只要和人在一起，狗一定有食物吃，這種親密關係，自古至今，仍是恆久不變的。";
        break;
        case 3:
        deast="豬";
        System.out.println(deast);
        Conste="p.jpg";
        deastintroduce="自古以來中國人都在家中養豬，祭拜大典也少不了牠，其與人類的關係深遠，一般人都以為豬又懶又笨，實際上豬很聰明，又愛清潔。";
        break;
        case 4:
        deast="鼠";
        System.out.println(deast);
        Conste="m.jpg";
        deastintroduce="老鼠對人類來說，是關係最密切的動物，牠分佈在全世界的每一個角落，只要有人的地方就有老鼠，牠們幾乎是無孔不入，無洞不鑽，無論在什麼惡劣的環境，都可以築巢為生。";
        break;
        case 5:
        deast="牛";
        System.out.println(deast);
        Conste="c.jpg";
        deastintroduce="俗語說：「馬走千里，牛走千里。」意思是牛馬各走千里，同時出發，雖然到達的時間早晚有別，但同樣都會到達目的地，都不會半而廢。";
        break;
        case 6:
        deast="虎";
        System.out.println(deast);
        Conste="t.jpg";
        deastintroduce="與其他動物比較，老虎得天獨厚，不但個性凶猛，而且有鮮艷又威武的外貌，我們常聽說；「雲從龍，風從虎」，而古人以青龍(東)、白虎(西)、朱雀(南)、玄武(北)為四靈禽瑞獸，象徵四方及四季，虎是令人敬而遠之的守護神。";
        break;
        case 7:
        deast="兔";
        System.out.println(deast);
        Conste="r.jpg";
        deastintroduce="兔子的個性十分柔順，彷彿初露光芒的朝陽，是那麼地和煦可人，但是如果以為兔子溫和好欺侮，那就大錯特錯了，「兔走疾麒麟」，形容兔子動作敏捷；「狡兔三窟」，就可以看出兔子是何等的深謀遠慮；「兔子不吃窩邊草」，可見兔子十分警戒周邊環境；兔子愛吃草是人盡皆知，而兔子更喜歡吃豆子來磨牙就鮮為人知。";
        break;
        case 8:
        deast="龍";
        System.out.println(deast);
        Conste="d.jpg";
        deastintroduce="龍是十二生肖中，唯一虛構，傳說中的瑞物珍獸，是中國人所創，也成了中國傳統文化的一部分，雖是時代變遷，但見龍跡經常在重大慶典上遊走。";
        break;
        case 9:
        deast="蛇";
        System.out.println(deast);
        Conste="s.jpg";
        deastintroduce="蛇，又名小龍或稱長蟲，是夜行動物，性喜葷食、鑽洞或在草地中遊走，翠綠的外表，足以嚇人，沒有腳，靠腹部鱗片運動前進，大蛇不怕人，小蛇怕人，蛇的精力旺盛。";
        break;
        case 10:
        deast="馬";
        System.out.println(deast);
        Conste="h.jpg";
        deastintroduce="馬是一種極受人喜愛的動物，天生行動快速，性格活潑開朗，古人說過「行天莫如龍，行地莫如馬」，「馬者，甲兵之本，國之大用」，馬是沙場之物，自古以來，名將和名駒的佳話不少，項羽和烏騅的故事最膾炙人口令人鼻酸。";
        break;
        case 11:
        deast="羊";
        System.out.println(deast);
        Conste="ss.jpg";
        deastintroduce="說文解字上說：「羊者祥也」，古代能當做天子諸侯祭祀供品的物類(牛、羊、豬)，必是神聖祥瑞的，由此可知「羊」在古人心目中，是一種溫文懦雅善良安祥的動物，總是不與人爭地低頭啃嚼青草，並且心平氣靜的漫步著。";
        break;
        case 0:
        deast="猴";
        System.out.println(deast);
        Conste="mm.jpg";
        deastintroduce="在達爾文的進化論中，人類的本源是猴子，猴子經過了長時間的演變進化為人。猴走起路來左搖右晃人模人樣，才智出眾是十二生肖之最。";
        break;

        }
       //星座
        switch(m){
        case 1:
        if(d >=1 && d <=20){
        	Zodiac="Capricorn.jpg";
        	Constellation="成熟的摩羯座只要很確定一份感情，就會很勇於表達了，他的熱情門關起來就知道了。";
        	System.out.println("魔羯座");
        
        break;
        }else if(d>=21 && d<=31){
        	Zodiac="Aquarius.jpg";
        	Constellation="水瓶座的人平常看起來很搞怪，可是出風頭的永遠不是他，因為水瓶座的人很低調。";
        	System.out.println("水瓶座");
        
        break;
        }
        case 2:
        if(d >=1 && d <=19){
        	Zodiac="Aquarius.jpg";
        	Constellation="水瓶座的人平常看起來很搞怪，可是出風頭的永遠不是他，因為水瓶座的人很低調。";
        	System.out.println("水瓶座");
        
        break;
        }else if(d>=20 && d<=29){
        	Zodiac="Pisces.jpg";
        	Constellation="雙魚座的人名副其實就是有兩種性格，在他感性迷濛的另一面，就是理性與工作狂。";
        	System.out.println("雙魚座");
        
        break;
        }
        case 3:
        if(d >=1 && d <=20){
        	Zodiac="Pisces.jpg";
        	Constellation="雙魚座的人名副其實就是有兩種性格，在他感性迷濛的另一面，就是理性與工作狂。";
        	System.out.println("雙魚座");
        
        }else if(d>=21 && d<=31){
        	Zodiac="Aries.jpg";
        	Constellation="牡羊座的人喜歡簡單，因為在外面就會多很多麻煩，在家隨便煮也是OK的。 如果要請客的話，白羊座也很願意自己來做菜，這樣他會覺得很有意思，因此反而練就了一身好廚藝。";
        	System.out.println("牡羊座");
        
        break;
        }
        case 4:
        if(d >=1 && d <=20){
        	Zodiac="Aries.jpg";
        	Constellation="牡羊座的人喜歡簡單，因為在外面就會多很多麻煩，在家隨便煮也是OK的。 如果要請客的話，白羊座也很願意自己來做菜，這樣他會覺得很有意思，因此反而練就了一身好廚藝。";
        	System.out.println("牡羊座");
        
        break;
        }else if(d>=21 && d<=30){
        	Zodiac="Taurus.jpg";
        	Constellation="金牛座的人平常是很實事求是，人家常常會讓他務實的那面給騙住了，事實上，金牛座的人要耍心眼的話，一開始就耍了，所以一開始就被他騙了。";
        	System.out.println("金牛座");
        
        break;
        }
        case 5:
        if(d >=1 && d <=21){
        	Zodiac="Taurus.jpg";
        	Constellation="金牛座的人平常是很實事求是，人家常常會讓他務實的那面給騙住了，事實上，金牛座的人要耍心眼的話，一開始就耍了，所以一開始就被他騙了。";
        	System.out.println("金牛座");
        
        break;
        }else if(d>=22 && d<=31){
        	Zodiac="Gemini.jpg";
        	Constellation="雙子座的人士是很好強經常在外人面前表現的很萬能，所以絕對不會讓人知道他有無能的時候，因此哭的時候是不會讓人家看到的。";
        	System.out.println("雙子座");
        
        break;
        }
        case 6:
        if(d >=1 && d <=21){
        	Zodiac="Gemini.jpg";
        	Constellation="雙子座的人士是很好強經常在外人面前表現的很萬能，所以絕對不會讓人知道他有無能的時候，因此哭的時候是不會讓人家看到的。";
        	System.out.println("雙子座");
        
        break;
        }else if(d>=22 && d<=30){
        	Zodiac="Cancer.jpg";
        	Constellation="對巨蟹座來說，家的定義有兩種，一種就是家庭的「家」，一種就是四海為家的「家」。";
        	System.out.println("巨蟹座");
        
        break;
        }
        case 7:
        if(d >=1 && d <=23){
        	Zodiac="Cancer.jpg";
        	Constellation="對巨蟹座來說，家的定義有兩種，一種就是家庭的「家」，一種就是四海為家的「家」。";
        	System.out.println("巨蟹座");
        
        break;
        }else if(d>=24 && d<=31){
        	Zodiac="Leo.jpg";
        	Constellation="有時獅子座的人會一副狀況外的樣子，其實他在裝傻，很多事情他都看在眼裡。";
        	System.out.println("獅子座");
        
        break;
        }
        case 8:
        if(d >=1 && d <=23){
        	Zodiac="Leo.jpg";
        	Constellation="有時獅子座的人會一副狀況外的樣子，其實他在裝傻，很多事情他都看在眼裡。";
        	System.out.println("獅子座");
        
        break;
        }else if(d>=24 && d<=31){
        	Zodiac="Virgo.jpg";
        	Constellation="處女座的人平常都會表現的一副道貌岸然，講話也是冠冕堂皇的樣子，其實他常會藉機吃吃豆腐，卻讓人家無法抓他的把柄，這一點是處女座讓人看不出來的另一面。";
        	System.out.println("處女座");
        
        break;
        }
        case 9:
        if(d >=1 && d <=23){
        	Zodiac="Virgo.jpg";
        	Constellation="處女座的人平常都會表現的一副道貌岸然，講話也是冠冕堂皇的樣子，其實他常會藉機吃吃豆腐，卻讓人家無法抓他的把柄，這一點是處女座讓人看不出來的另一面。";
        	System.out.println("處女座");
        
        break;
        }else if(d>=24 && d<=30){
        	Zodiac="Libra.jpg";
        	Constellation="天秤座的人看起來什麼都好，可是實際上別人也不會在他身上撈到什麼好處。";
        	System.out.println("天秤座");
        
        break;
        }
        case 10:
        if(d >=1 && d <=23){
        	Zodiac="Libra.jpg";
        	Constellation="天秤座的人看起來什麼都好，可是實際上別人也不會在他身上撈到什麼好處。";
        	System.out.println("天秤座");
        
        break;
        }else if(d>=24 && d<=31){
        	Zodiac="Scorpio.jpg";
        	Constellation="雖然天蠍座的外表好像很聰明、很厲害、精明，什麼事都可以一眼看穿，事實上要騙他的心是很容易的。";
        	System.out.println("天蠍座");
        
        break;
        }
        case 11:
        if(d >=1 && d <=22){
        	Zodiac="Scorpio.jpg";
        	Constellation="雖然天蠍座的外表好像很聰明、很厲害、精明，什麼事都可以一眼看穿，事實上要騙他的心是很容易的。";
        	System.out.println("天蠍座");
        
        break;
        }else if(d>=23 && d<=30){
        	Zodiac="Sagittarius.jpg";
        	Constellation="如果是射手座已經事先計劃好的事，是不會臨時為任何人而改變的。";
        	System.out.println("射手座");
        
        break;
        }
        case 12:
        if(d >=1 && d <=22){
        	Zodiac="Sagittarius.jpg";
        	Constellation="如果是射手座已經事先計劃好的事，是不會臨時為任何人而改變的。";
        	System.out.println("射手座");
        
        break;
        }else if(d>=23 && d<=31){
        	Zodiac="Capricorn.jpg";
        	Constellation="成熟的摩羯座只要很確定一份感情，就會很勇於表達了，他的熱情門關起來就知道了。";
        	System.out.println("魔羯座"); 
        
        break;
        }
      }
        
        model.addAttribute("Constellation", Constellation);
        model.addAttribute("Zodiac", Zodiac);
        model.addAttribute("deastintroduce", deastintroduce);
        model.addAttribute("Conste", Conste);
        
        System.out.println("hahaha uccu");
        
     
        
        
       
        
        	//介紹
         //生肖介紹deastintroduce
         //星座介紹Constellation
        ///生肖圖{Zodiac}
        ///星座圖{Conste}
        
        
        //System.out.println(d);
        //System.out.println(m);
        //System.out.println(y);
        //生肖
        
        
        
        
        return "helloWorld";
        
    }
}
