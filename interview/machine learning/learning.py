import cv2 
import numpy as np 

img = cv2.imread("images/yibowang.jpg")

cv2.imwrite('images/updateyibo.jpg', img)

cv2.imshow('window_name', img)
cv2.waitKey()

cv2.destroyAllWindows() 

h,w,c = img.shape # tuple 1st is height corresponds to row of numpy, 2nd height - column, 3rd is tong dao shu 

print('xiangsu', img.size)
print('type', img.dtype)

img_Blur = cv2.blur(img, (5,5)) #均值滤波， 邻域

img_medianBlur = cv2.medianBlur(img, 5)
img_GaussianBlur = cv2.GaussianBlur(img, (7,7),0)
img_bilateral = cv2.bilateralFilter(img,9,75,75)


kernel = cv2.getStructuringElement(cv2.MORPH_RECT, (5, 5))
kernel = cv2.getStructuringElement(cv2.MORPH_ELLIPSE, (5, 5))
kernel = cv2.getStructuringElement(cv2.MORPH_CROSS, (5, 5))

kernel = np.ones((5, 5), np.uint8)

erosin = cv2.erode(img, kernel)
dilation = cv2.dilate(img, kernel)
opened = cv2.morphologyEx(img, cv2.MORPH_OPEN, kernel)
closed = cv2.morphologyEx(img, cv2.MORPH_CLOSE, kernel)

img_resize = cv2.resize(img, (h,w), interpolation = cv2.INTER_AREA)
ret,mask = cv2.threshold(img, 127, 255, cv2.THRESH_BINARY)

# cv2.THRESH_BINARY_INV
# CV2.THRESH_TRUNC
# cv2.THRESH_TOZERO_INV
# cv2.THRESH_TOZERO_INV 

# mask = cv2.adaptiveThreshold(img, 255, cv2.ADAPTIVE_THRESH_MEAN_C, cv2.THRESH_BINARY, 11, 2)

#cv2.ADAPTIVE_THRESH_GAUSSIAN_C

img_rotate = cv2.rotate(img, 0)

image_height = 350
image_weight = 400

mat_rotate = cv2.getRotationMatrix2D((image_height*0.5, image_weight*0.5), 45, 1)
dst_rotate = cv2.warpAffine(img,mat_rotate, (image_height, image_weight))

mat_src = np.float32([[0, 0], [0, image_height-1], [image_weight-1, 0]])
mat_dst = np.float32([[50,50],[300, image_height-200], [image_weight-300, 100]])
mat_Affine = cv2.getAffineTransform(mat_src, mat_dst)
dst = cv2.warpAffine(img, mat_Affine,(image_height, image_weight))

cv2.imwrite('images/updateyibo2.jpg', img)