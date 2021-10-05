package com.tlc.tradingsystem.membership;

import com.tlc.tradingsystem.client.Client;

public abstract class MembershipType {
   private String status;
   Client client;

   public MembershipType(String status) {
      this.status = status;
   }

   public String getStatus() {
      return status;
   }

   public void setStatus(Bronze bronze) {
      int point = client.getPoint();
      
      if (point > 0 && point < 9) {
        // 
      }
   }
}
