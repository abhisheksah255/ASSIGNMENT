function NoOfFlip() {
          return(Math.random() < 0.7) ? 'Heads' : 'Tails'; 
    }

 var totalCount=10;
 var HeadCount=0; 
 for (var i=0; i<totalCount;i++){
     if (NoOfFlip()==='Heads'){
       HeadCount++;
     }
 }
 alert("Heads will be Appears "+(HeadCount/totalCount)*100+"% of the time");