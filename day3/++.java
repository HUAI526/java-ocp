int x=1, y=1;
      //boolean b=++x>++y;//運作順序x=x+1;y=y+1;x>y
       //boolean b=x++>++y;//運作順序y=y+1;x>y;x=x+1
		boolean b=++x>y++;//運作順序x=x+1;x>y;y=y+1   
       System.out.println(b);
       System.out.println(x);
       System.out.println(y);
