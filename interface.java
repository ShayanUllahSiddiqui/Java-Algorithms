interface Animal {

    public void eat();
    public void travel();
    
    
    public  class  Reptiles implements Animal{
        @Override
        public void eat(){
            System.out.println("\nREPTILES\nReptiles feed on some form of animal life (such as insects, mollusks, birds, frogs, mammals, fishes, or even other reptiles).");
        }
    
        @Override
        public void travel(){
            System.out.println("Most reptiles can live and travel their entire lives on land while some types of reptiles (such as sea turtles and penguins) are adapted to living in water.\n");
        }
    }
     
    



    public  class  birds implements Animal{
        @Override
        public void eat(){  
            System.out.println("\nBIRDS\nMost birds naturally eat include insects, plant material, small berries or fruit, and nuts. Larger birds like hawks and vultures may also eat small animals like rodents and snakes.");
        }

        @Override
        public void travel(){        
          System.out.println("Many bird populations migrate long distances along a flyway. The most common pattern involves flying north in the spring to breed in the temperate\n");
        }
    }





    public  class  Fish implements Animal{
        @Override
        public void eat(){
            System.out.println("\nFISH\nIn the wild they feast on live fish, insects, larvae and crustaceans.");
        }

        @Override
        public void travel(){
            System.out.println("Fishes live in virtually all aquatic habitats. Different species of fish are adapted for different habitats.\n");
        }


    }
    
    

    


    public static void main(String args[]) {
    
        Animal repobj = new Reptiles();
        repobj.eat();
        repobj.travel();


        Animal birdobj = new birds();
        birdobj.eat();
        birdobj.travel(); 


        Animal fishobj = new Fish();
        fishobj.eat();
        fishobj.travel();            
    }
}