class Solution{
    public ListNode mergeTwolists(ListNode list1,ListNode list2){
        //initialzation 
        ListNode dummy=new ListNode(0);
        //pointer to build the new List
        ListNode.current=dummy;
        while(list1!=null && list2!=null){
            if(list1.val<list2.val){
                //current.next is mainly to merge into the main list 
                //so its like saying that add list1 value in merged list 
                current.next=list1;
                
                list1=list1.next;
            }
            else{
                current.next=list2;
                list2=list2.next;
                
            }
            current=current.next;
            
        }

        if(list1==null){
            current.next=list2;
            
        }
        else{
            current.next=list1;
            
        }
        
    }
    
}
