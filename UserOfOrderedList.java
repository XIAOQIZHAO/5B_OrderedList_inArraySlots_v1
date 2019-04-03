/**
  test OrderedList
 */

public class UserOfOrderedList {
    public static OrderedList_inArraySlots orderedList =
      new OrderedList_inArraySlots();

    public static void main(String[] commandLine) {
        System.out.println( orderedList);
        System.out.println( System.lineSeparator());

        addOne( "populate an empty list"
               , 0
               ,"[0,]"
               );

        addOne( "add an element that belongs at the front"
               , -11
               ,"[-11,0,]"
               );

        addOne( "add an element that belongs at the back"
               , 5
               ,"[-11,0,5,]"
               );

        addOne( "add an element that belongs somewhere in the middle"
               , 2
               ,"[-11,0,2,5,]"
               );

        addOne( "add an element that is the same as another element"
               , 0
               ,"[-11,0,0,2,5,]"
               );

        one( "get element0"
               , 0
               ,"-11"
	     , "get"
               );

        one( "ordered list size"
               , 23498
               ,"5"
	     , "size"
               );

        one( "remove element4"
               , 4
               ,"[-11,0,0,2]"
	     , "remove"
               );

    }

    
    /**
      run one test
     */
    private static void addOne( String description
                              , int value
                              , String expect
                              ) {
        System.out.println( description);
        orderedList.add( value);

        // check 
        System.out.println( 
            "result:   "
          + orderedList
          + " ...expecting "
          + expect
          + System.lineSeparator());
     }

    private static void one( String description
			     , int value
			     , String expect
			     , String type
			     ) {
        System.out.println( description);
	if (type == "add")
	    orderedList.add( value);
	if (type == "size")
	    System.out.println(orderedList.size());
	if (type == "get")
	    System.out.println(orderedList.get( value));
	if (type == "remove")
	    System.out.println(orderedList.remove( value));
	

        // check 
        System.out.println( 
            "result:   "
          + orderedList
          + " ...expecting "
          + expect
          + System.lineSeparator());
     }

}    
