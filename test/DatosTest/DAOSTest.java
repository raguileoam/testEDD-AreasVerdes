/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatosTest;

import Modelo.Mapa;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author raguileoam
 */
public class DAOSTest {
    Mapa mapa;
     LinkedList<String> av;
     LinkedList<String> p;
    @Before
    public void setup(){
        av=new LinkedList<>();
        p=new LinkedList<>();
        String dir="/home/raguileoam/Documentos/5 Semestre/Estructura de datos/Proyecto Semestral/AreasVerdesMVC/datos/";
        mapa=new Mapa(dir);
    }
    @Test
    public void testAV(){
        for(int i=0;i<mapa.getAreasVerdes().size();i++){
            //System.out.println(i+" "+mapa.getAreasVerdes().get(i).getSector());
            if(!av.contains(mapa.getAreasVerdes().get(i).getSector())){
                av.add(mapa.getAreasVerdes().get(i).getSector());
            }
    }
        //System.out.println(av);
    }


    
    }    

