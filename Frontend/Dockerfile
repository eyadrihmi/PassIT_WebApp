#app construction
FROM node:14.15.4 as node

WORKDIR /app

COPY . .

RUN npm install

RUN npm run build --prod

#deployment with nginx
FROM nginx:alpine

COPY --from=node /app/dist/* /usr/share/nginx/html

RUN rm /etc/nginx/conf.d/default.conf

COPY nginx.conf /etc/nginx/conf.d/

EXPOSE 80

CMD ["nginx", "-g", "daemon off;"]
