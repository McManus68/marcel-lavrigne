import { Injectable } from '@angular/core';
import {  Headers, RequestOptions, Response } from '@angular/http';
import { Observable } from 'rxjs';
import 'rxjs/add/operator/map'

import { AuthenticationService } from '../services/authentication.service';
import { User } from '../model/user';

@Injectable()
export class UserService {
    constructor(private authenticationService: AuthenticationService) {
    }

    getUsers(): Observable<User[]> {
        // add authorization header with jwt token
        let headers = new Headers({ 'Authorization': 'Bearer ' + this.authenticationService.token });
        let options = new RequestOptions({ headers: headers });

        // get users from api
        /*return this.http.get('/api/users', options)
            .map((response: Response) => response.json());*/
        return null;
    }
}
