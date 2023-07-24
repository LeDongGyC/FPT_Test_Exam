drop database if exists db_fpt;
create database db_fpt;
use db_fpt;

create table truong(
ma_truong varchar(10) primary key,
    ten_truong varchar(45),
    dia_chi varchar(45),
    so_dt varchar(10)
);
create table nganh(
	ma_nganh varchar(10) primary key,
    ten_nganh varchar(45),
    loai_nganh varchar(45)
);
create table sinh_vien(
	so_cmnd varchar(13) primary key,
    ho_ten varchar(45),
	email varchar(45),
    so_dt varchar(10),
    dia_chi varchar(45)
);
create table tot_nghiep(
	so_cmnd varchar(13),
    ma_truong varchar(10),
    ma_nganh varchar(10),
    primary key(so_cmnd, ma_truong, ma_nganh),
    foreign key(so_cmnd) references sinh_vien(so_cmnd),
    foreign key(ma_truong) references truong(ma_truong),
    foreign key(ma_nganh) references nganh(ma_nganh),
    he_tn varchar(10),
    ngay_tn date,
    loai_tn varchar(10)
);
create table cong_viec(
	so_cmnd varchar(13),
    ma_nganh varchar(10),
	ngay_vao_cong_ty date,
    primary key(so_cmnd, ngay_vao_cong_ty),
    foreign key(so_cmnd) references sinh_vien(so_cmnd),
    foreign key(ma_nganh) references nganh(ma_nganh),
    ten_cong_viec varchar(45),
    ten_cong_ty varchar(45),
    dia_chi_cong_ty varchar(45),
    thoi_gian_lam_viec int
);
-- data truong
INSERT INTO `db_fpt`.`truong` (`ma_truong`, `dia_chi`, `so_dt`, `ten_truong`) VALUES ('DDF', '41 Lê Duẩn, Đà Nẵng', '0236382257', 'Đại Học Ngoại Ngữ');
INSERT INTO `db_fpt`.`truong` (`ma_truong`, `dia_chi`, `so_dt`, `ten_truong`) VALUES ('DDG','62 Ngô Sĩ Liên, Đà Nẵng','0236284132','Khoa Giáo dục thể chất ');
INSERT INTO `db_fpt`.`truong` (`ma_truong`, `dia_chi`, `so_dt`, `ten_truong`) VALUES ('DDK', '54 Nguyễn Lương Bằng, Đà Nẵng', '0236384230', 'Đại Học Bách Khoa');
INSERT INTO `db_fpt`.`truong` (`ma_truong`, `dia_chi`, `so_dt`, `ten_truong`) VALUES ('DDQ', '71 Ngũ Hành Sơn, Đà Nẵng', '0236383616', 'Đại Học Kinh Tế');
INSERT INTO `db_fpt`.`truong` (`ma_truong`, `dia_chi`, `so_dt`, `ten_truong`) VALUES ('DDS', '489 Tôn Đức Thắng, Đà Nẵng', '0236369932', 'Đại Học Sư Phạm');
INSERT INTO `db_fpt`.`truong` (`ma_truong`, `dia_chi`, `so_dt`, `ten_truong`) VALUES ('DDY', 'Làng Đại Học, Hòa Qúy, Ngũ Hành Sơn, Đà Nẵng', '0236284077', 'Khoa Y Dược');
INSERT INTO `db_fpt`.`truong` (`ma_truong`, `dia_chi`, `so_dt`, `ten_truong`) VALUES ('DSK', '48 Cao Thắng, Đà Nẵng', '0236382257', 'Đại Học Sư Phạm Kỹ Thuật');
INSERT INTO `db_fpt`.`truong` (`ma_truong`, `dia_chi`, `so_dt`, `ten_truong`) VALUES ('VKU', '470 Trần Đại Nghĩa, Đà Nẵng', '0236655268', 'Đại Học Việt Hàn');
-- data nganh
INSERT INTO `db_fpt`.`nganh` (`ma_nganh`, `ten_nganh`, `loai_nganh`) VALUES ('7140231', 'Sư phạm tiếng Anh', 'Ngành sư phạm tiếng Anh(DDF)');
INSERT INTO `db_fpt`.`nganh` (`ma_nganh`, `ten_nganh`, `loai_nganh`) VALUES ('7140234', 'Sư phạm tiếng Trung Quốc', 'Ngành sư phạm tiếng Trung Quốc');
INSERT INTO `db_fpt`.`nganh` (`ma_nganh`, `ten_nganh`, `loai_nganh`) VALUES ('7480201', 'Công nghệ thông tin', 'Ngành công nghệ thông tin(DDK)');
INSERT INTO `db_fpt`.`nganh` (`ma_nganh`, `ten_nganh`, `loai_nganh`) VALUES ('7480106', 'Kỹ thuật máy tính', 'Ngành kĩ thuật phần mềm');
INSERT INTO `db_fpt`.`nganh` (`ma_nganh`, `ten_nganh`, `loai_nganh`) VALUES ('7420201', 'Công nghệ sinh học', 'Ngành công nghệ sinh học');
INSERT INTO `db_fpt`.`nganh` (`ma_nganh`, `ten_nganh`, `loai_nganh`) VALUES ('7510105', 'Công nghệ kỹ thuật vật liệu xây dựng', 'Ngành khoa học vật liệu');
INSERT INTO `db_fpt`.`nganh` (`ma_nganh`, `ten_nganh`, `loai_nganh`) VALUES ('7520114', 'Kỹ thuật Cơ điện tử', 'Ngành điện tử');
INSERT INTO `db_fpt`.`nganh` (`ma_nganh`, `ten_nganh`, `loai_nganh`) VALUES ('7140210', 'Sư phạm Tin học', 'Ngành sư phạm Tin học(DDS)');
INSERT INTO `db_fpt`.`nganh` (`ma_nganh`, `ten_nganh`, `loai_nganh`) VALUES ('7340101', 'Quản trị kinh doanh', 'Ngành quản trị kinh doanh(DDQ)');
INSERT INTO `db_fpt`.`nganh` (`ma_nganh`, `ten_nganh`, `loai_nganh`) VALUES ('7340115', 'Marketing', 'Ngành Marketing');
INSERT INTO `db_fpt`.`nganh` (`ma_nganh`, `ten_nganh`, `loai_nganh`) VALUES ('7340120', 'Kinh doanh quốc tế', 'Ngành Kinh doanh quốc tế');
INSERT INTO `db_fpt`.`nganh` (`ma_nganh`, `ten_nganh`, `loai_nganh`) VALUES ('7340404', 'Quản trị nhân lực', 'Ngành quản trị nhân lực');
INSERT INTO `db_fpt`.`nganh` (`ma_nganh`, `ten_nganh`, `loai_nganh`) VALUES ('7380107', 'Luật kinh tế', 'Ngành luật kinh tế');
INSERT INTO `db_fpt`.`nganh` (`ma_nganh`, `ten_nganh`, `loai_nganh`) VALUES ('7810201', 'Quản trị khách sạn', 'Ngành quản trị khách sạn');
INSERT INTO `db_fpt`.`nganh` (`ma_nganh`, `ten_nganh`, `loai_nganh`) VALUES ('7720101', 'Y khoa', 'Ngành Y đa khoa(DDY)');
INSERT INTO `db_fpt`.`nganh` (`ma_nganh`, `ten_nganh`, `loai_nganh`) VALUES ('7720301', 'Điều dưỡng', 'Ngành điều dưỡng');
INSERT INTO `db_fpt`.`nganh` (`ma_nganh`, `ten_nganh`, `loai_nganh`) VALUES ('7720501', 'Răng - Hàm - Mặt', 'Ngành răng hàm mặt');
INSERT INTO `db_fpt`.`nganh` (`ma_nganh`, `ten_nganh`, `loai_nganh`) VALUES ('7720201', 'Dược học', 'Ngành dược');
INSERT INTO `db_fpt`.`nganh` (`ma_nganh`, `ten_nganh`, `loai_nganh`) VALUES ('7510205', 'Công nghệ kỹ thuật ô tô', 'Ngành kỹ thuật ô tô(DSK)');
INSERT INTO `db_fpt`.`nganh` (`ma_nganh`, `ten_nganh`, `loai_nganh`) VALUES ('7510302', 'Công nghệ kỹ thuật điện tử - viễn thông', 'Ngành điện tử viễn thông');
-- data sinh_vien
INSERT INTO sinh_vien (so_cmnd, ho_ten, email, so_dt, dia_chi) VALUES
('2645988037623', 'Nguyễn Văn An', 'nguyenvanan@.com', '0337355842', 'Hà Nội'),
('1457623892301', 'Trần Thị Bình', 'tranthibinh@.com', '0904567321', 'Hải Phòng'),
('2569347582013', 'Lê Thị Cẩm', 'lethicam@.com', '0987123456', 'Hồ Chí Minh'),
('3694820395842', 'Phạm Văn Dũng', 'phamvandung@.com', '0975839201', 'Đà Nẵng'),
('4738291058394', 'Hoàng Thị Diễm', 'hoangthidiem@.com', '0938572940', 'Huế'),
('5839174930510', 'Vũ Văn Đức', 'vuvanduc@.com', '0917465830', 'Cần Thơ'),
('6920583928475', 'Ngô Thị Ý', 'ngothiy@.com', '0985739201', 'Hải Dương'),
('7103948572631', 'Đinh Văn Phong', 'dinhvanphong@.com', '0973829105', 'Hà Nam'),
('8194729385643', 'Trần Thị Hoa', 'tranthihoa@.com', '0910473629', 'Nghệ An'),
('1029384756253', 'Lê Văn Long', 'levanlong@.com', '0902938475', 'Nam Định'),
('1122334455667', 'Nguyễn Thị Quỳnh', 'nguyenthiquynh@.com', '0337355842', 'Quảng Ninh'),
('2223334445556', 'Trương Văn Linh', 'truongvanlinh@.com', '0975839201', 'Thanh Hóa'),
('3334445556667', 'Phan Thị Hoàng', 'phanthihoang@.com', '0917465830', 'Bắc Giang'),
('4445556667778', 'Lý Văn Tuấn', 'lyvantuan@.com', '0985739201', 'Hưng Yên'),
('5556667778889', 'Đỗ Thị Nga', 'dothinga@.com', '0910473629', 'Vĩnh Phúc'),
('6667778889990', 'Vương Văn Kiên', 'vuongvankien@.com', '0902938475', 'Hà Tĩnh'),
('7778889990001', 'Nguyễn Thị Lan', 'nguyenthilan@.com', '0337355842', 'Thái Bình'),
('8889990001112', 'Trần Văn Hùng', 'tranvanhung@.com', '0975839201', 'Ninh Bình'),
('9990001112223', 'Phạm Thị Ngọc', 'phamthingoc@.com', '0917465830', 'Thái Nguyên'),
('0001112223334', 'Lê Văn Đông', 'levandong@.com', '0985739201', 'Hòa Bình');
INSERT INTO sinh_vien (so_cmnd, ho_ten, email, so_dt, dia_chi) VALUES
('1705200312023', 'Phạm Lê Đông', 'phamledong@.com', '0337366923', 'Quảng Nam');
-- data tot_nghiep 
INSERT INTO tot_nghiep (so_cmnd, ma_truong, ma_nganh, he_tn, ngay_tn, loai_tn) VALUES
('1029384756253', 'DDG', '7140231', 'Kĩ sư', '2023-07-02', 'Khá'),
('1122334455667', 'DDK', '7140234', 'Cử nhân', '2023-07-03', 'Trung bình'),
('1457623892301', 'DDQ', '7340101', 'Kĩ sư', '2023-07-04', 'Giỏi'),
('2223334445556', 'DDS', '7340115', 'Cử nhân', '2023-07-05', 'Khá'),
('2569347582013', 'DDY', '7340120', 'Kĩ sư', '2023-07-06', 'Trung bình'),
('2645988037623', 'DSK', '7340404', 'Kĩ sư', '2023-07-07', 'Giỏi'),
('3334445556667', 'VKU', '7380107', 'Cử nhân', '2023-07-08', 'Khá'),
('3694820395842', 'DDF', '7420201', 'Thạc sĩ', '2023-07-09', 'Trung bình'),
('4445556667778', 'DDG', '7480106', 'Kĩ sư', '2023-07-10', 'Giỏi'),
('4738291058394', 'DDK', '7480201', 'Thạc sĩ', '2023-07-11', 'Khá'),
('5556667778889', 'DDQ', '7510105', 'Cử nhân', '2023-07-12', 'Trung bình'),
('5839174930510', 'DDS', '7510205', 'Kĩ sư', '2023-07-13', 'Giỏi'),
('6667778889990', 'DDY', '7510302', 'Cử nhân', '2023-07-14', 'Khá'),
('6920583928475', 'DSK', '7520114', 'Thạc sĩ', '2023-07-15', 'Trung bình'),
('7103948572631', 'VKU', '7720101', 'Kĩ sư', '2023-07-16', 'Giỏi'),
('7778889990001', 'DDF', '7720201', 'Cử nhân', '2023-07-17', 'Khá'),
('8194729385643', 'DDG', '7720301', 'Kĩ sư', '2023-07-18', 'Trung bình'),
('8889990001112', 'DDK', '7720501', 'Thạc sĩ', '2023-07-19', 'Giỏi'),
('9990001112223', 'DDQ', '7810201', 'Kĩ sư', '2023-07-20', 'Khá');
INSERT INTO tot_nghiep (so_cmnd, ma_truong, ma_nganh, he_tn, ngay_tn, loai_tn) VALUES
('0001112223334', 'DDF', '7140210', 'Cử nhân', '2023-07-01', 'Giỏi');

-- data cong_viec
drop table cong_viec;
-- Sinh viên 1
INSERT INTO cong_viec (so_cmnd, ma_nganh, ngay_vao_cong_ty, ten_cong_viec, ten_cong_ty, dia_chi_cong_ty, thoi_gian_lam_viec) VALUES
('0001112223334', '7140210', '2023-07-05', 'Kỹ sư phần mềm', 'Công ty ABC', 'Hà Nội', 10);

-- Sinh viên 2
INSERT INTO cong_viec (so_cmnd, ma_nganh, ngay_vao_cong_ty, ten_cong_viec, ten_cong_ty, dia_chi_cong_ty, thoi_gian_lam_viec) VALUES
('1029384756253', '7140231', '2024-02-10', 'Giảng viên Tiếng Anh', 'Trường Đại học XYZ', 'Nam Định', 9);

-- Sinh viên 3
INSERT INTO cong_viec (so_cmnd, ma_nganh, ngay_vao_cong_ty, ten_cong_viec, ten_cong_ty, dia_chi_cong_ty, thoi_gian_lam_viec) VALUES
('1122334455667', '7140234', '2023-12-20', 'Kỹ sư Trung Quốc', 'Công ty XYZ', 'Quảng Ninh', 7);

-- Sinh viên 4
INSERT INTO cong_viec (so_cmnd, ma_nganh, ngay_vao_cong_ty, ten_cong_viec, ten_cong_ty, dia_chi_cong_ty, thoi_gian_lam_viec) VALUES
('1457623892301', '7340101', '2024-09-05', 'Quản trị kinh doanh', 'Công ty DEF', 'Hải Phòng', 8);

-- Sinh viên 5
INSERT INTO cong_viec (so_cmnd, ma_nganh, ngay_vao_cong_ty, ten_cong_viec, ten_cong_ty, dia_chi_cong_ty, thoi_gian_lam_viec) VALUES
('2223334445556', '7340115', '2023-11-01', 'Marketing Manager', 'Công ty XYZ', 'Thanh Hóa', 12);

-- Sinh viên 6
INSERT INTO cong_viec (so_cmnd, ma_nganh, ngay_vao_cong_ty, ten_cong_viec, ten_cong_ty, dia_chi_cong_ty, thoi_gian_lam_viec) VALUES
('2569347582013', '7340120', '2023-10-10', 'Kinh doanh quốc tế', 'Công ty KLM', 'Hồ Chí Minh', 12);

-- Sinh viên 7
INSERT INTO cong_viec (so_cmnd, ma_nganh, ngay_vao_cong_ty, ten_cong_viec, ten_cong_ty, dia_chi_cong_ty, thoi_gian_lam_viec) VALUES
('2645988037623', '7340404', '2024-03-15', 'Nhân sự', 'Công ty MNO', 'Hà Nội', 10);

-- Sinh viên 8
INSERT INTO cong_viec (so_cmnd, ma_nganh, ngay_vao_cong_ty, ten_cong_viec, ten_cong_ty, dia_chi_cong_ty, thoi_gian_lam_viec) VALUES
('3334445556667', '7380107', '2023-08-20', 'Luật sư', 'Văn phòng luật sư ABC', 'Bắc Giang', 8);

-- Sinh viên 9
INSERT INTO cong_viec (so_cmnd, ma_nganh, ngay_vao_cong_ty, ten_cong_viec, ten_cong_ty, dia_chi_cong_ty, thoi_gian_lam_viec) VALUES
('3694820395842', '7420201', '2024-01-10', 'Nhà nghiên cứu sinh học', 'Viện Sinh học XYZ', 'Đà Nẵng', 9);

-- Sinh viên 10
INSERT INTO cong_viec (so_cmnd, ma_nganh, ngay_vao_cong_ty, ten_cong_viec, ten_cong_ty, dia_chi_cong_ty, thoi_gian_lam_viec) VALUES
('4445556667778', '7480106', '2024-04-20', 'Kỹ sư máy tính', 'Công ty PQR', 'Hưng Yên', 12);

-- Sinh viên 11
INSERT INTO cong_viec (so_cmnd, ma_nganh, ngay_vao_cong_ty, ten_cong_viec, ten_cong_ty, dia_chi_cong_ty, thoi_gian_lam_viec) VALUES
('4738291058394', '7510105', '2023-08-15', 'Chuyên viên Marketing', 'Công ty XYZ', 'Huế', 7);

-- Sinh viên 12
INSERT INTO cong_viec (so_cmnd, ma_nganh, ngay_vao_cong_ty, ten_cong_viec, ten_cong_ty, dia_chi_cong_ty, thoi_gian_lam_viec) VALUES
('5556667778889', '7510205', '2023-12-01', 'Kỹ sư ô tô', 'Công ty ABC', 'Vĩnh Phúc', 10);

-- Sinh viên 13
INSERT INTO cong_viec (so_cmnd, ma_nganh, ngay_vao_cong_ty, ten_cong_viec, ten_cong_ty, dia_chi_cong_ty, thoi_gian_lam_viec) VALUES
('5839174930510', '7510302', '2024-03-20', 'Chuyên viên điện tử', 'Công ty XYZ', 'Cần Thơ', 7);

-- Sinh viên 14
INSERT INTO cong_viec (so_cmnd, ma_nganh, ngay_vao_cong_ty, ten_cong_viec, ten_cong_ty, dia_chi_cong_ty, thoi_gian_lam_viec) VALUES
('6667778889990', '7520114', '2023-09-10', 'Kỹ sư điện tử', 'Công ty XYZ', 'Hà Tĩnh', 2);

-- Sinh viên 15
INSERT INTO cong_viec (so_cmnd, ma_nganh, ngay_vao_cong_ty, ten_cong_viec, ten_cong_ty, dia_chi_cong_ty, thoi_gian_lam_viec) VALUES
('6920583928475', '7720101', '2024-05-01', 'Bác sĩ đa khoa', 'Bệnh viện XYZ', 'Hải Dương', 3);

-- Sinh viên 16
INSERT INTO cong_viec (so_cmnd, ma_nganh, ngay_vao_cong_ty, ten_cong_viec, ten_cong_ty, dia_chi_cong_ty, thoi_gian_lam_viec) VALUES
('7103948572631', '7720201', '2023-09-15', 'Dược sĩ', 'Nhà thuốc ABC', 'Hà Nam', 4);

-- Sinh viên 17
INSERT INTO cong_viec (so_cmnd, ma_nganh, ngay_vao_cong_ty, ten_cong_viec, ten_cong_ty, dia_chi_cong_ty, thoi_gian_lam_viec) VALUES
('7778889990001', '7720301', '2023-11-10', 'Điều dưỡng viên', 'Bệnh viện XYZ', 'Thái Bình', 2);

-- Sinh viên 18
INSERT INTO cong_viec (so_cmnd, ma_nganh, ngay_vao_cong_ty, ten_cong_viec, ten_cong_ty, dia_chi_cong_ty, thoi_gian_lam_viec) VALUES
('8194729385643', '7720501', '2024-04-05', 'Bác sĩ răng hàm mặt', 'Phòng khám ABC', 'Nghệ An', 3);

-- Sinh viên 19
INSERT INTO cong_viec (so_cmnd, ma_nganh, ngay_vao_cong_ty, ten_cong_viec, ten_cong_ty, dia_chi_cong_ty, thoi_gian_lam_viec) VALUES
('8889990001112', '7810201', '2023-07-20', 'Quản lý khách sạn', 'Khách sạn XYZ', 'Ninh Bình', 4);

-- Sinh viên 20
INSERT INTO cong_viec (so_cmnd, ma_nganh, ngay_vao_cong_ty, ten_cong_viec, ten_cong_ty, dia_chi_cong_ty, thoi_gian_lam_viec) VALUES
('9990001112223', '7810201', '2024-08-10', 'Quản lý khách sạn', 'Khách sạn XYZ', 'Thái Nguyên', 3);