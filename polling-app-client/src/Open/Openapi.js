import React, {useState } from 'react';
import { Button, Modal, ModalHeader, ModalBody, ModalFooter } from 'reactstrap';
import { withRouter } from 'react-router-dom';
import OpenService from './Open-service'
import { notification } from 'antd';
import ServerStart from './ServerStart'


const ModalExample = (props) => {
  
  const [modal, setModal] = useState(false);

  const toggle = () => setModal(!modal);
  
  const openupload= () => {
    OpenService.openupload(props.username, props.userkey);
    toggle();
    notification.success({
      message: 'file to api',
      description: "open api 생성!",
    });
    
  }

  const serviceStart = () => {
    ServerStart.serviceStart();
   toggle();    
  }

  return (
    <div>
      <Button className="openbtn"  outline color="danger" size="lg" onClick={serviceStart}>Open-API 서비스 시작</Button>
      <Modal isOpen={modal} modalTransition={{ timeout: 500 }} backdropTransition={{ timeout: 800 }}
        toggle={toggle} >
        <ModalHeader toggle={toggle}> OPEN API 서비스 시작</ModalHeader>
        <ModalBody>
            {props.userfiles}
            파일로 api 서비스를 생성합니다.
        </ModalBody>
        <ModalFooter>
          <Button color="primary" onClick={openupload} >API START
            
          </Button>{' '}
          <Button color="secondary" onClick={toggle}>Cancel</Button>
        </ModalFooter>
      </Modal>
    </div>
  );
}

export default withRouter(ModalExample);

