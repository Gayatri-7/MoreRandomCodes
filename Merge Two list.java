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
                //this is saying that make list1 ki last node 
                //ki value pehle stp me to merged list me add kardi abhi
    //usi added node ki next value list1 me store karde matlab ussi list me age chale ja
                list1=list1.next;
            }
            else{
                current.next=list2;
                list2=list2.next;
                
            }
            current=current.next;
            
        }
//if list1 kahtam ho gyi to list2 ke sare elemnts merged list(current.next) me chipka dena 
        if(list1==null){
            current.next=list2;
            
        }
        else{
            current.next=list1;
            
        }
        
    }
    
}