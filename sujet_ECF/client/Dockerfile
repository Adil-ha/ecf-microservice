
FROM node:14 as build

WORKDIR /app

COPY . .

RUN yarn install

RUN yarn run build

FROM nginx:alpine

COPY --from=build /app/build /usr/share/nginx/html

EXPOSE 80

CMD ["nginx", "-g", "daemon off;"]
