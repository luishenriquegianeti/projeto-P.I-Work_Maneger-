  /*script feito para verificar se tem @ . e se a quantidade de caraquiter esta correto */
  const forma = document.getElementById('forma');
  const campos = document.querySelectorAll('.required');
  const spans = document.querySelectorAll('.spam-required');
  const emailRegex = /^[^\s]+@(gmail\.com|hotmail\.com)$/;
  
  function setError(index) {
      campos[index].style.border = '3px solid #e63636';
      spans[index].style.display = 'block';
  }
  
  function removerError(index) {
      campos[index].style.border = '';
      spans[index].style.display = 'none';
  }
  
  function emailValidate() {
      const email = campos[0].value;
      if (!emailRegex.test(email)) {
          setError(0);
      } else {
          removerError(0);
      }
  }
  
      function  senhaValidate(){
              if(campos[1].value.length < 5)
              {
                  setError(1);
              }
              else
              {
                  removerError(1);
              }
      }      
      const togglePassword = document.querySelector('#togglePassword');
  const password = document.querySelector('#senha');
  
  togglePassword.addEventListener('click', function () {
      // Alterna o tipo de input entre 'password' e 'text'
      const type = password.getAttribute('type') === 'password' ? 'text' : 'password';
      password.setAttribute('type', type);
  
      // Alterna o ícone entre olho aberto e fechado
      this.classList.toggle('fa-eye');
      this.classList.toggle('fa-eye-slash');
  });
  