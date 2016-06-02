 class IntValue implements observer {
     int data ;
     public void setValue(int i){
         data = i;
         mention();
     }

     @Override
     public void mention() {
         Printer printer = new Printer();
         printer.display(data);
     }
 }
