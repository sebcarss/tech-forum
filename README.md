# Tech Forum Service

A service to manage and gain info on the Tech Forum events.   

## Development

http://localhost:8080
```shell script
# Running the application
> gradle bootRun
```

## Testing

```shell script
# Run unit tests
> gradle test
```

## APIs

### /api/v1/events

Returns the list of all events past and future.

Params: None

Returns: JSON

Example:

```json
[
  {
    "eventNumber":1
  }
]
```
