INSERT INTO isales_sys.t_qn_user
  (operator_id, 
  org_code, 
  operator_name, 
  login_name, 
  mobile, 
  `password`, 
  status, 
  create_time,
  user_type,
  audit_status,
  user_code,
  create_id,
  create_name,
  update_id,
  update_name) 
  VALUES (-9999999999,
  '',
  'test_operator_name', 
  'testLoginName', 
  '13854203280', 
  '6ae764186a5eb74c649526dd59330114',
  '101',
  now(), 
  '101',
  '102',
  'aaaabbbb',
  1,
  'admin',
  1,
  'admin');

INSERT INTO 
  isales_sys.t_qn_user_account 
  (id,
  operator_id,
  account_id,
  account_name, 
  `password`,
  create_time,
  account_type, 
  account_status) VALUES 
  (-999999999999, 
  -9999999999, 
  null,
  'testLoginName',
  '6ae764186a5eb74c649526dd59330114',
 now(), '101','101');