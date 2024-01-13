package com.mti.agencia;

import java.util.Comparator;

public class PacoteViagemComparator implements Comparator<PacoteViagem> {

  @Override
  public int compare(PacoteViagem o1, PacoteViagem o2) {
    // TODO Auto-generated method stub
    return Double.compare(o1.getPrecoPorPessoa(), o2.getPrecoPorPessoa());
  }

    

}