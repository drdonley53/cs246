userTextField.setOnKeyPressed(new EventHandler<KeyEvent>(){
        @Override
	    public void handle(KeyEvent ke){
            if(ke.getCode().equals(KeyCode.ENTER)){
                String Run = userTextField.getText();
                userTextField.clear();
		try{ 
		    Runnable r = (Runnable)Class.forName(Run).newInstance();
		    if(!list.getItems().contains(Run)){
			list.getItems().add(Run);
		    }
                
		}catch(Exception ex){
		    System.out.println("It is not a runnable");
		}
                
            }
        }
    });