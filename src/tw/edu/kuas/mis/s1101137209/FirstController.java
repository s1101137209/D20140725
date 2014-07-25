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
        deast="��";
        System.out.println(deast);
        Conste="cc.jpg";
        deastintroduce="��������A�B�B�;��A�H�H�®𽴫k�صM�@�s�A�b�j�N���������A���O���ƪ����~�A���M�묹�F�ͩR�A�o�쪺�N���o���Τ��B�ϡB�ޡC�q�e�j�Ҭ۬��}���A�ݥ�����ӡu���嬰���v�A�����i�H�Ψӥe�R�A����ﭷ�����A�ʻ������Y�o�}�ۤv���L�d�A�i�����O�j���ҩy���N�����C";
        break;
        case 2:
        deast="��";
        System.out.println(deast);
        Conste="dd.jpg";
        deastintroduce="�۱q�H���H���y���Ͷ}�l�A���N�O�H���̿˪�̩��ꪺ�B�͡A�]�O�̭n�n���ͬ����A�u�n�M�H�b�@�_�A���@�w�������Y�A�o�ؿ˱K���Y�A�ۥj�ܤ��A���O��[���ܪ��C";
        break;
        case 3:
        deast="��";
        System.out.println(deast);
        Conste="p.jpg";
        deastintroduce="�ۥj�H�Ӥ���H���b�a���i�ޡA�����j��]�֤��F�e�A��P�H�������Y�`���A�@��H���H���ޤS�i�S�¡A��ڤW�ޫ��o���A�S�R�M��C";
        break;
        case 4:
        deast="��";
        System.out.println(deast);
        Conste="m.jpg";
        deastintroduce="�ѹ���H���ӻ��A�O���Y�̱K�����ʪ��A�e���G�b���@�ɪ��C�@�Ө����A�u�n���H���a��N���ѹ��A�e�̴X�G�O�L�դ��J�A�L�}���p�A�L�צb����c�H�����ҡA���i�H�v�_���͡C";
        break;
        case 5:
        deast="��";
        System.out.println(deast);
        Conste="c.jpg";
        deastintroduce="�U�y���G�u�����d���A�����d���C�v�N��O�����U���d���A�P�ɥX�o�A���M��F���ɶ����ߦ��O�A���P�˳��|��F�ت��a�A�����|�b�Ӽo�C";
        break;
        case 6:
        deast="��";
        System.out.println(deast);
        Conste="t.jpg";
        deastintroduce="�P��L�ʪ�����A�Ѫ�o�ѿW�p�A�����өʤ��r�A�ӥB���A�A�S�ªZ���~���A�ڭ̱`ť���F�u���q�s�A���q��v�A�ӥj�H�H�C�s(�F)�B�ժ�(��)�B����(�n)�B�ȪZ(�_)���|�F�V���~�A�H�x�|��Υ|�u�A��O�O�H�q�ӻ������u�@���C";
        break;
        case 7:
        deast="��";
        System.out.println(deast);
        Conste="r.jpg";
        deastintroduce="�ߤl���өʤQ���X���A�ϩ����S���~���¶��A�O����a�M�֥i�H�A���O�p�G�H���ߤl�ũM�n�۫V�A���N�j���S���F�A�u�ߨ��e�Q��v�A�ήe�ߤl�ʧ@�ӱ��F�u���ߤT�]�v�A�N�i�H�ݥX�ߤl�O�󵥪��`�ѻ��{�F�u�ߤl���Y�����v�A�i���ߤl�Q��ĵ�٩P�����ҡF�ߤl�R�Y��O�H�ɬҪ��A�Өߤl����w�Y���l�ӿi���N�A���H���C";
        break;
        case 8:
        deast="�s";
        System.out.println(deast);
        Conste="d.jpg";
        deastintroduce="�s�O�Q�G�ͨv���A�ߤ@��c�A�ǻ������窫���~�A�O����H�ҳСA�]���F����ǲΤ�ƪ��@�����A���O�ɥN�ܾE�A�����s��g�`�b���j�y��W�C���C";
        break;
        case 9:
        deast="�D";
        System.out.println(deast);
        Conste="s.jpg";
        deastintroduce="�D�A�S�W�p�s�κ٪��ΡA�O�]��ʪ��A�ʳ߸����B�p�}�Φb��a���C���A�A�񪺥~��A���H�~�H�A�S���}�A�a��������B�ʫe�i�A�j�D���ȤH�A�p�D�ȤH�A�D����O�����C";
        break;
        case 10:
        deast="��";
        System.out.println(deast);
        Conste="h.jpg";
        deastintroduce="���O�@�ط����H�߷R���ʪ��A�ѥͦ�ʧֳt�A�ʮ次��}�ԡA�j�H���L�u��Ѳ��p�s�A��a���p���v�A�u���̡A�ҧL�����A�ꤧ�j�Ρv�A���O�F�������A�ۥj�H�ӡA�W�N�M�W�s���θܤ��֡A���ЩM�Q񶪺�G�Ƴ��z���H�f�O�H��ġC";
        break;
        case 11:
        deast="��";
        System.out.println(deast);
        Conste="ss.jpg";
        deastintroduce="����Ѧr�W���G�u�Ϫ̲��]�v�A�j�N����Ѥl�ѫJ�����ѫ~������(���B�ϡB��)�A���O���t���窺�A�Ѧ��i���u�ϡv�b�j�H�ߥؤ��A�O�@�طŤ��������}�w�����ʪ��A�`�O���P�H���a�C�Y���Z�C��A�åB�ߥ����R�����B�ۡC";
        break;
        case 0:
        deast="�U";
        System.out.println(deast);
        Conste="mm.jpg";
        deastintroduce="�b�F���媺�i�ƽפ��A�H���������O�U�l�A�U�l�g�L�F���ɶ����t�ܶi�Ƭ��H�C�U���_���ӥ��n�k�̤H�ҤH�ˡA�~���X���O�Q�G�ͨv���̡C";
        break;

        }
       //�P�y
        switch(m){
        case 1:
        if(d >=1 && d <=20){
        	Zodiac="Capricorn.jpg";
        	Constellation="���������~�y�u�n�ܽT�w�@���P���A�N�|�ܫi���F�F�A�L�����������_�ӴN���D�F�C";
        	System.out.println("�]�~�y");
        
        break;
        }else if(d>=21 && d<=31){
        	Zodiac="Aquarius.jpg";
        	Constellation="���~�y���H���`�ݰ_�ӫܷd�ǡA�i�O�X���Y���û����O�L�A�]�����~�y���H�ܧC�աC";
        	System.out.println("���~�y");
        
        break;
        }
        case 2:
        if(d >=1 && d <=19){
        	Zodiac="Aquarius.jpg";
        	Constellation="���~�y���H���`�ݰ_�ӫܷd�ǡA�i�O�X���Y���û����O�L�A�]�����~�y���H�ܧC�աC";
        	System.out.println("���~�y");
        
        break;
        }else if(d>=20 && d<=29){
        	Zodiac="Pisces.jpg";
        	Constellation="�����y���H�W�ƨ��N�O����ةʮ�A�b�L�P�ʰg�۪��t�@���A�N�O�z�ʻP�u�@�g�C";
        	System.out.println("�����y");
        
        break;
        }
        case 3:
        if(d >=1 && d <=20){
        	Zodiac="Pisces.jpg";
        	Constellation="�����y���H�W�ƨ��N�O����ةʮ�A�b�L�P�ʰg�۪��t�@���A�N�O�z�ʻP�u�@�g�C";
        	System.out.println("�����y");
        
        }else if(d>=21 && d<=31){
        	Zodiac="Aries.jpg";
        	Constellation="�d�Ϯy���H���w²��A�]���b�~���N�|�h�ܦh�·СA�b�a�H�K�N�]�OOK���C �p�G�n�ЫȪ��ܡA�զϮy�]���@�N�ۤv�Ӱ���A�o�˥L�|ı�o�ܦ��N��A�]���Ϧӽm�N�F�@���n�p���C";
        	System.out.println("�d�Ϯy");
        
        break;
        }
        case 4:
        if(d >=1 && d <=20){
        	Zodiac="Aries.jpg";
        	Constellation="�d�Ϯy���H���w²��A�]���b�~���N�|�h�ܦh�·СA�b�a�H�K�N�]�OOK���C �p�G�n�ЫȪ��ܡA�զϮy�]���@�N�ۤv�Ӱ���A�o�˥L�|ı�o�ܦ��N��A�]���Ϧӽm�N�F�@���n�p���C";
        	System.out.println("�d�Ϯy");
        
        break;
        }else if(d>=21 && d<=30){
        	Zodiac="Taurus.jpg";
        	Constellation="�����y���H���`�O�ܹ�ƨD�O�A�H�a�`�`�|���L�ȹꪺ�������F��F�A�ƹ�W�A�����y���H�n�A�߲����ܡA�@�}�l�N�A�F�A�ҥH�@�}�l�N�Q�L�F�F�C";
        	System.out.println("�����y");
        
        break;
        }
        case 5:
        if(d >=1 && d <=21){
        	Zodiac="Taurus.jpg";
        	Constellation="�����y���H���`�O�ܹ�ƨD�O�A�H�a�`�`�|���L�ȹꪺ�������F��F�A�ƹ�W�A�����y���H�n�A�߲����ܡA�@�}�l�N�A�F�A�ҥH�@�}�l�N�Q�L�F�F�C";
        	System.out.println("�����y");
        
        break;
        }else if(d>=22 && d<=31){
        	Zodiac="Gemini.jpg";
        	Constellation="���l�y���H�h�O�ܦn�j�g�`�b�~�H���e��{���ܸU��A�ҥH���藍�|���H���D�L���L�઺�ɭԡA�]�������ɭԬO���|���H�a�ݨ쪺�C";
        	System.out.println("���l�y");
        
        break;
        }
        case 6:
        if(d >=1 && d <=21){
        	Zodiac="Gemini.jpg";
        	Constellation="���l�y���H�h�O�ܦn�j�g�`�b�~�H���e��{���ܸU��A�ҥH���藍�|���H���D�L���L�઺�ɭԡA�]�������ɭԬO���|���H�a�ݨ쪺�C";
        	System.out.println("���l�y");
        
        break;
        }else if(d>=22 && d<=30){
        	Zodiac="Cancer.jpg";
        	Constellation="�泌�ɮy�ӻ��A�a���w�q����ءA�@�شN�O�a�x���u�a�v�A�@�شN�O�|�����a���u�a�v�C";
        	System.out.println("���ɮy");
        
        break;
        }
        case 7:
        if(d >=1 && d <=23){
        	Zodiac="Cancer.jpg";
        	Constellation="�泌�ɮy�ӻ��A�a���w�q����ءA�@�شN�O�a�x���u�a�v�A�@�شN�O�|�����a���u�a�v�C";
        	System.out.println("���ɮy");
        
        break;
        }else if(d>=24 && d<=31){
        	Zodiac="Leo.jpg";
        	Constellation="���ɷ�l�y���H�|�@�ƪ��p�~���ˤl�A���L�b�˶̡A�ܦh�Ʊ��L���ݦb���̡C";
        	System.out.println("��l�y");
        
        break;
        }
        case 8:
        if(d >=1 && d <=23){
        	Zodiac="Leo.jpg";
        	Constellation="���ɷ�l�y���H�|�@�ƪ��p�~���ˤl�A���L�b�˶̡A�ܦh�Ʊ��L���ݦb���̡C";
        	System.out.println("��l�y");
        
        break;
        }else if(d>=24 && d<=31){
        	Zodiac="Virgo.jpg";
        	Constellation="�B�k�y���H���`���|��{���@�ƹD�����M�A���ܤ]�O�a�ð�Ӫ��ˤl�A���L�`�|�Ǿ��Y�Y���G�A�o���H�a�L�k��L����`�A�o�@�I�O�B�k�y���H�ݤ��X�Ӫ��t�@���C";
        	System.out.println("�B�k�y");
        
        break;
        }
        case 9:
        if(d >=1 && d <=23){
        	Zodiac="Virgo.jpg";
        	Constellation="�B�k�y���H���`���|��{���@�ƹD�����M�A���ܤ]�O�a�ð�Ӫ��ˤl�A���L�`�|�Ǿ��Y�Y���G�A�o���H�a�L�k��L����`�A�o�@�I�O�B�k�y���H�ݤ��X�Ӫ��t�@���C";
        	System.out.println("�B�k�y");
        
        break;
        }else if(d>=24 && d<=30){
        	Zodiac="Libra.jpg";
        	Constellation="�ѯ��y���H�ݰ_�Ӥ��򳣦n�A�i�O��ڤW�O�H�]���|�b�L���W���줰��n�B�C";
        	System.out.println("�ѯ��y");
        
        break;
        }
        case 10:
        if(d >=1 && d <=23){
        	Zodiac="Libra.jpg";
        	Constellation="�ѯ��y���H�ݰ_�Ӥ��򳣦n�A�i�O��ڤW�O�H�]���|�b�L���W���줰��n�B�C";
        	System.out.println("�ѯ��y");
        
        break;
        }else if(d>=24 && d<=31){
        	Zodiac="Scorpio.jpg";
        	Constellation="���M���Ȯy���~��n�����o���B�ܼF�`�B����A����Ƴ��i�H�@���ݬ�A�ƹ�W�n�F�L���߬O�ܮe�����C";
        	System.out.println("���Ȯy");
        
        break;
        }
        case 11:
        if(d >=1 && d <=22){
        	Zodiac="Scorpio.jpg";
        	Constellation="���M���Ȯy���~��n�����o���B�ܼF�`�B����A����Ƴ��i�H�@���ݬ�A�ƹ�W�n�F�L���߬O�ܮe�����C";
        	System.out.println("���Ȯy");
        
        break;
        }else if(d>=23 && d<=30){
        	Zodiac="Sagittarius.jpg";
        	Constellation="�p�G�O�g��y�w�g�ƥ��p���n���ơA�O���|�{�ɬ�����H�ӧ��ܪ��C";
        	System.out.println("�g��y");
        
        break;
        }
        case 12:
        if(d >=1 && d <=22){
        	Zodiac="Sagittarius.jpg";
        	Constellation="�p�G�O�g��y�w�g�ƥ��p���n���ơA�O���|�{�ɬ�����H�ӧ��ܪ��C";
        	System.out.println("�g��y");
        
        break;
        }else if(d>=23 && d<=31){
        	Zodiac="Capricorn.jpg";
        	Constellation="���������~�y�u�n�ܽT�w�@���P���A�N�|�ܫi���F�F�A�L�����������_�ӴN���D�F�C";
        	System.out.println("�]�~�y"); 
        
        break;
        }
      }
        
        model.addAttribute("Constellation", Constellation);
        model.addAttribute("Zodiac", Zodiac);
        model.addAttribute("deastintroduce", deastintroduce);
        model.addAttribute("Conste", Conste);
        
        System.out.println("hahaha uccu");
        
     
        
        
       
        
        	//����
         //�ͨv����deastintroduce
         //�P�y����Constellation
        ///�ͨv��{Zodiac}
        ///�P�y��{Conste}
        
        
        //System.out.println(d);
        //System.out.println(m);
        //System.out.println(y);
        //�ͨv
        
        
        
        
        return "helloWorld";
        
    }
}
